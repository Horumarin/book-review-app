# 書籍レビュー管理アプリ（Spring Boot）

Java / Spring Boot を用いて作成した、書籍情報の登録・表示・編集・削除ができる Webアプリケーションです。  
ポートフォリオとして、基本的な MVC 構成・バリデーション・テンプレートエンジンなどの技術を取り入れました。

---

## 📌 機能一覧

- 書籍の一覧表示
- 書籍の新規登録（フォーム＋バリデーション）
- 書籍の詳細表示
- 書籍の編集機能
- 書籍の削除機能

---

## 🛠 使用技術

| 技術         | バージョン / 補足             |
|--------------|-------------------------------|
| Java         | 17                            |
| Spring Boot  | 3.x（Spring MVC, JPA）        |
| Thymeleaf    | テンプレートエンジン          |
| H2 Database  | 組み込み型DB（開発用）        |
| Maven        | 依存管理ツール                |

---

## 🗂 画面構成

- `/book/list` : 書籍の一覧ページ
- `/book/create` : 書籍の新規登録ページ
- `/book/{id}/view` : 詳細ページ
- `/book/{id}/edit` : 編集ページ

---

## 📦 セットアップ手順

```bash
# クローン
git clone https://github.com/あなたのアカウント/book-review-app.git
cd book-review-app

# Mavenで起動
./mvnw spring-boot:run
