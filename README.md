# 📓 SOOP Live 카테고리 이미지 로드 프로젝트

SOOP Live에서 제공하는 카테고리 데이터를 가져와 이미지를 로드하고 표시하는 Android 앱입니다.  
Retrofit2를 이용하여 API에서 카테고리 데이터를 가져오고, Coil을 활용하여 효율적으로 이미지를 캐싱 및 로드합니다.  
Jetpack Compose 기반으로 개발되었으며, 가로/세로 모드를 지원하는 반응형 UI를 제공합니다.

---

## 💡 실행 방법

### **1. 프로젝트 클론**
```sh
git clone https://github.com/YOUR_USERNAME/soop-live-image-loader.git
```

### **2. Android Studio에서 열기**
- Android Studio에서 프로젝트를 엽니다.
- 필요한 SDK 및 라이브러리를 자동으로 다운로드 합니다.

### **3. 앱 실행**
- Run 버튼을 클릭하여 앱을 실행합니다.
- Android 기기 또는 에뮬레이터로 앱을 확인할 수 있습니다.

### **4. 카테고리 목록 로드**
- 메인화면의 상단에 있는 "SOOP LIVE 카테고리" 버튼을 누르면 목록이 로드됩니다.
- 버튼을 한번 더 누르면 목록을 숨깁니다.

## 🛠️ 사용한 기술 스택

| 기술 | 설명 | 선택 이유 |
|------|------|----------|
| **Kotlin** | Android 개발을 위한 프로그래밍 언어 | 최신 Android 개발 트렌드 반영, 간결한 코드 |
| **Jetpack Compose** | UI 개발을 위한 최신 선언형 UI 툴킷 | XML 기반보다 간결하고 유지보수성이 높음 |
| **Retrofit2** | API 요청 및 JSON 파싱 라이브러리 | 비동기 네트워크 요청이 간편하고 성능이 우수함 |
| **Coil** | Android 이미지 로딩 라이브러리 | 가볍고 빠르며, Compose와 완벽한 호환성 |
| **ViewModel (AndroidX)** | UI 상태 관리를 위한 라이브러리 | 데이터 유지 및 생명주기 관리 |
| **LiveData & StateFlow** | UI와 데이터를 동기화하는 반응형 데이터 흐름 | Compose에서 `collectAsState()`와 자연스럽게 연동 가능 |

---

## ✅ 구현 기능 목록

- **SOOP Live 카테고리 목록 조회**
    - Retrofit2를 사용하여 SOOP Live API에서 카테고리 데이터를 가져옴

- **이미지 로드 & 캐싱 (Coil 사용)**
    - Coil 라이브러리를 이용하여 썸네일 이미지를 빠르게 로드
    - 메모리 & 디스크 캐시 지원

- **가로/세로 모드 지원**
    - `LocalConfiguration`을 활용하여 가로 모드에서는 한 줄에 4개, 세로 모드에서는 2개의 카테고리 표시

- **태그 자동 줄 바꿈 처리 & UI 최적화 (FlowRow 사용)**
    - FlowRow를 활용하여 태그가 최대 너비를 초과하면 자동으로 다음 줄로 배치

- **조회수 오버레이 표시**
    - 이미지 왼쪽 상단에 조회수를 반투명 배경과 함께 오버레이


