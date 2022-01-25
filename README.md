# spring-vue-webpack

Spring + vue + webpack (api server + frontend)

### 스프링에 vue-cli 웹팩 기반의 프론트엔드 환경을 접목
### webpack-dev 환경에서 개발, build로 배포 

``` bash
cd frontend

npm run dev --> 개발환경(other port)

npm run build --> 완성품 빌드

* Spring static folder에 프론트관련 파일들이 build된다.

* /frontend/config/index.js 에서 build.index, build.assetsRoot 로 경로 수정함.
```


#### 1. Spring project 생성

#### 2. Root folder에서 명령 입력 - 프론트엔드 

```bash
npm install -g vue-cli
--> npm install @vue/cli-init -g

vue init webpack frontend

cd frontend

npm install --save-dev babel-loader babel-core babel-preset-env

npm install --save vuex

npm install --save es6-promise

```

* 아직 잘 이해는 못하겠다.(..)
* es-lint 체크는 제외해버리는게 편하겠다.
