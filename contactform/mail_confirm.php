<!doctype HTML>
<html lang="ja">

<head>
    <meta charaset="utf-8">
    <title>お問い合わせフォームを作る</title>
    <link rel="stylesheet"type="text/css" href="style2.css">
    </head>

<body>
    <h1>お問い合わせ内容確認</h1>
    
    <div class="confirm">
    <p>お問い合わせ内容はこちらでよろしいでしょうか？
        <br>よろしければ「送信する」ボタンを押してください。
        </p>
    <p>名前
        <br>
        <?php echo $_post['name'];?>
        </p>
    
    <p>メールアドレス
        <br>
        <?php echo $_post['mail']; ?>
        </p>
    <p>年齢
        <br>
        <?php echo $_post['age']; ?>
        </p>
   <p>コメント
        <br>
        <</p> </div></body></html>