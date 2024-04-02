# Do Not Delete this Repository.

### Required Tools 

- CNA 구현 실습에 필요한 Software를 Download Link를 클릭해 내 OS에 맞는 설치파일로 Install 한다.

1. **JDK 11 - 애플리케이션 런타임**
    - **계정**: [oracle 계정생성 로그인](https://www.oracle.com)
    - **설치 url**: [Download Link](https://www.oracle.com/kr/java/technologies/javase/jdk11-archive-downloads.html)

2. **VS Code - 통합 개발 도구(IDE)**
    - **설치 url**: [Download Link](https://code.visualstudio.com/download)

3. **Git - 소스코드 형상관리 도구**
    - **설치 url**: [Download Link](https://git-scm.com/downloads)

4. **파이선**
    - 설치 시 "Add Python to PATH" 옵션을 체크
    - **설치 url**: [Download Link](https://www.python.org/downloads/)
    
5. **httpie - CLI 기반 HTTP 클라이언트** 설치
    ```bash
    # 검색창 cmd 입력 명령프롬프트창 open
    pip install --upgrade pip setuptools
    pip install --upgrade httpie
    ```

6. **Maven - Java용 프로젝트 빌더 도구**
    - **설치 url**: [Download Link](https://maven.apache.org/download.cgi)

7. **Node.js - 프론트엔드 JavaScript 런타임**
    - LTS버전 설치
    - **설치 url**: [Download Link](https://nodejs.org/ko/download)

8. **Docker Desktop - 애플리케이션 컨테이너 관리도구**
    - **계정**: [docker 계정생성](https://www.docker.com)
    - **설치 url**: [Download Link](https://www.docker.com/products/docker-desktop/)


## 설치 완료 후 진행 (Windows OS)

1. 관리자 권한으로 powershell 실행 (시작메뉴 검색창) 후 아래 명령어 실행
    ```bash
    dism.exe /online /enable-feature /featurename:Microsoft-Windows-Subsystem-Linux /all /norestart
    dism.exe /online /enable-feature /featurename:VirtualMachinePlatform /all /norestart
    ```

2. wsl 버전 문제
    - **다운로드 url**: [Download Link](https://wslstorestorage.blob.core.windows.net/wslblob/wsl_update_x64.msi)
    ```bash
    wsl --set-default-version 2
    ```
