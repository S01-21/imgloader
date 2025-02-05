# 📡 SOOP Live API 문서

SOOP Live API를 사용하여 카테고리 데이터를 가져오는 방법을 설명합니다.  
이 문서는 API 엔드포인트, 요청 방법, 응답 데이터 예시 등을 포함합니다.

---

## 🔗 1. 카테고리 리스트 조회 API

**📌 엔드포인트:**  
``` https://sch.sooplive.co.kr/api.php?m=categoryList&szKeyword=&szOrder=view_cnt&nPageNo=1&nListCnt=120&nOffset=0&szPlatform=pc ```

**📌 요청 방식:** 
``` GET /api.php?m=categoryList&szKeyword=&szOrder=view_cnt&nPageNo=1&nListCnt=120&nOffset=0&szPlatform=pc ```

---

## 📥 2. 요청 파라미터 설명

| 파라미터 | 타입 | 필수 여부 | 설명 |
|----------|------|----------|------|
| `m` | `String` | ✅ | API 타입 (고정값: `"categoryList"`) |
| `szKeyword` | `String` | ❌ | 검색 키워드 (기본값: 빈 문자열) |
| `szOrder` | `String` | ❌ | 정렬 기준 (`"view_cnt"` = 조회수 순 정렬) |
| `nPageNo` | `Int` | ✅ | 페이지 번호 |
| `nListCnt` | `Int` | ✅ | 한 번에 가져올 카테고리 개수 |
| `nOffset` | `Int` | ❌ | 오프셋 값 (기본값: `0`) |
| `szPlatform` | `String` | ✅ | 요청 플랫폼 (`"pc"` 고정) |

---

## 📤 3. 응답 데이터 예시 (JSON)

```json
{
    "result": 1,
    "data": {
        "is_more": true,
        "offset": 120,
        "list": [
            {
                "category_no": "00130000",
                "category_name": "토크/캠방",
                "view_cnt": 36224,
                "fixed_tags": ["보라", "토크"],
                "cate_img": "https://admin.img.sooplive.co.kr/category_img/2024/10/15/7849670d90c7abaa8.png"
            },
            {
                "category_no": "00040019",
                "category_name": "리그 오브 레전드",
                "view_cnt": 50940,
                "fixed_tags": ["MOBA"],
                "cate_img": "https://admin.img.sooplive.co.kr/category_img/2025/01/13/12406784d27555d5c.jpg"
            }
        ]
    }
}
```

---

## 🛠️ 4. 데이터 모델 (CategoryItem)
```kotlin
data class CategoryItem(
    @SerializedName("category_no") val categoryNo: String,
    @SerializedName("category_name") val categoryName: String,
    @SerializedName("view_cnt") val viewCount: Int,
    @SerializedName("fixed_tags") val fixedTags: List<String>,
    @SerializedName("cate_img") val categoryImage: String
)
```

---

## 📌 5. 사용 예시 (Retrofit2)
```kotlin
import retrofit2.http.GET
import retrofit2.http.Query

interface SoopLiveApi {
    @GET("api.php")
    suspend fun getCategories(
        @Query("m") m: String = "categoryList",
        @Query("szKeyword") szKeyword: String = "",
        @Query("szOrder") szOrder: String = "view_cnt",
        @Query("nPageNo") nPageNo: Int = 1,
        @Query("nListCnt") nListCnt: Int = 120,
        @Query("nOffset") nOffset: Int = 0,
        @Query("szPlatform") szPlatform: String = "pc"
    ): CategoryResponse
}
```

## 🔗 6. 관련 문서
- https://square.github.io/retrofit/