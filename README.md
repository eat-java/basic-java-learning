# basic-java-learning

## 브랜치 만들기
`checkout`과 `-b`를 함께 쓰면 새로운 브랜치를 만들고 그 브랜치로 이동합니다. 브랜치의 이름은 주차(예: week01), 이름(예: skeptic-biped 혹은 sungjoon 등 자신이 편한 이름), 문제(예: #01 등 문제를 식별할 수 있는 번호)의 조합을 사용합니다.
```zsh
git checkout -b feature/주차_이름_문제
```
만들고 나서 `git branch`를 사용하면 자신이 만든 브랜치의 목록을 확인할 수 있습니다.  
방금 만든 브랜치에서 작업 후 다음과 같이 `commit`, `push` 합니다.
```zsh
git commit -a -m "1주차 1번 문제 풀이"
git push
```
위 작업이 끝나고 우리의 저장소에 접속하 pull request가 활성화된 것을 확인할 수 있습니다. 