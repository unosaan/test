<!DOCTYPE html>
<html lang="ja">

<head>
    <meta charaset="UTF-8">
    <title>4eachblog 掲示板</title>
    <link rel="stylesheet" type="text/css" href="style2.css">
</head>

<body>
    
   
    <img src="4eachblog_logo.jpg" class="logo">
    <header>
        <ul>
            <li>トップ</li>
            <li>プロフィール</li>
            <li>4eachについて</li>
            <li>登録フォーム</li>
            <li>お問い合わせ</li>
            <li>その他</li>
        </ul>
    </header>

    <main>
        <div class="main">



            <div class="left">
                <h1>プログラミングに役立つ掲示板</h1>
                <form method="post" action="insert.php">
                    <h2>入力フォーム</h2>
                    <div>
                        <label>ハンドルネーム</label>
                        <br>
                        <input type="text" class="text" size="35" name="handlename"></div>
                    <div>
                        <label>タイトル</label>
                        <br>
                        <input type="text" size="35" name="title"></div>
                    <div>
                        <label>コメント</label>
                        <br>
                        <textarea cols="50" rows="7" name="comments"></textarea></div>
                    <div>
                        <input type="submit" class="submit" value="投稿する"></div>
                    </form>
                <?php
    
    mb_internal_encoding("utf8");
    $pdo =new PDO("mysql:dbname=lesson01;host=localhost;","root","mysql");
    $stmt = $pdo->query("select * from 4each_keijiban");
    
    
   
    ?>
    
    <?php
    
    echo " <div class='kiji'> ";
    echo " <h3>タイトル</h3> ";
    echo " <div class='conntents'> ";
    echo "記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。<br>
    記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。<br>
    記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。<br>
    記事の中身。記事の中身。記事の中身。記事の中身。記事の中身。<br>";
    echo " <div class='handlename'>posted by 通りすがり</div>";
    echo "</div>";
    echo "</div>";
    
    ?>
    
    <?php
    
    while ($row =$stmt->fetch()){
        echo "<div class='kiji'>";
        echo "<h3>" .$row['title']."</h3>";
        echo "<div class='comments'>";
        echo $row['comments'];
        echo "<div class='handlename'>posted by".$row['handlename']."</div>";
        echo "</div>";
        echo "</div>";
    }
    
    ?>
                
         </div>
             <div class="right">
                        <h2>人気の記事</h2>
                        <ul>
                            <li>PHPオススメ本</li>
                            <br>
                            <li>PHP Myadminの使い方</li>
                            <br>
                            <li>今人気のエディタTop5</li>
                            <br>
                            <li>HTMLの基礎</li>
                        </ul>

                        <h2>オススメリンク</h2>
                        <ul>
                            <li>インターノウス株式会社</li>
                            <br>
                            <li>XAMPPのダウンロード</li>
                            <br>
                            <li>Eclipseのダウンロード</li>
                            <br>
                            <li>Braketsのダウンロード</li>
                        </ul>
                        <h2>カテゴリ</h2>
                        <ul>
                            <li>HTML</li>
                            <br>
                            <li>PHP</li>
                            <br>
                            <li>Mysql</li>
                            <br>
                            <li>JavaScript</li>
                        </ul>
            </div>
            
           



                
            
        </div>
    </main>

    <footer>copyright internous | 4each blog is the one which provides A to Z about programing
    </footer>


</body>


</html>
