set names utf8;
set foreign_key_checks = 0;
drop database if exists green;

create database if not exists green;
use green;

create table user_info(
id int primary key  not null auto_increment,
user_id varchar(16) unique not null,
password varchar(16) not null,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32) not null,
first_name_kana varchar(32) not null,
sex tinyint default 0,
email varchar(32),
status tinyint default 0,
logined tinyint default 0 not null,
regist_date datetime,
update_date datetime
);

create table product_info(
id int not null primary key auto_increment,
product_id int not null unique,
product_name varchar(100) not null unique,
product_name_kana varchar(100) not null unique,
product_description varchar(255),
category_id int not null ,
price int  not null,
image_file_path varchar(100) not null,
image_file_name varchar(50) not null,
release_date datetime,
release_company varchar(50),
status tinyint default 1,
regist_date datetime,
update_date datetime,

foreign key(category_id) references m_category(category_id)
);

create table cart_info(
id int not null primary key auto_increment,
user_id varchar(16) not null,
product_id int not null,
product_count int not null,
price int,
regist_date datetime,
update_date datetime,

foreign key(product_id) references product_info(product_id)
);

create table purchase_history_info(
id int not null primary key auto_increment,
user_id varchar(16) not null,
product_id int not null,
product_count int,
price int,
destination_id int not null,
regist_date datetime,
update_date datetime,

foreign key(user_id) references user_info(user_id),
foreign key(product_id) references product_info(product_id)
);

create table destination_info(
id int not null primary key auto_increment,
user_id varchar(16) not null,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32) not null,
first_name_kana varchar(32) not null,
email varchar(32),
tel_number varchar(13),
user_address varchar(50) not null,
regist_date datetime,
update_date datetime,

foreign key(user_id) references user_info(user_id)
);

create table m_category(
id int not null primary key auto_increment,
category_id int not null unique,
category_name varchar(20) not null unique,
category_description varchar(100),
insert_date datetime not null,
update_date datetime
);

insert into user_info values(1,"guest","guest","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー",0,"internous.guest@gmail.com",0,0,now(),now()),
(2,"guest2","guest2","インターノウス","ゲストユーザー2","いんたーのうす","げすとゆーざー2",0,"internous.guest2@gmail.com",0,0,now(),now());

insert into destination_info values(1,"guest","インターノウス","ゲストユーザー","いんたーのうす","げすとゆーざー","internous.guest@gmail.com","09000000000","東京都千代田区霞が関 3-6-15",now(),now());

insert into m_category(category_id,category_name,insert_date)values(1,"すべてのカテゴリー",now()),(2,"本",now()),(3,"電化製品",now()),(4,"おもちゃ・ゲーム",now()),(5,"小物・雑貨",now());

insert into product_info(product_id,product_name,product_name_kana,product_description,category_id,price,image_file_path,image_file_name,release_company,release_date)
values(1,"ハートの本","はーとのほん","ハート型の本です。",2,1000,"./images","heart_book.jpg","株式会社greenbook",now()),
      (2,"Britanicaの本","ぶりたにかのほん","ブリタニカも歴史書です。",2,2000,"./images","Britanica_book.jpg","株式会社greenbook",now()),
      (3,"ボロボロの本","ぼろぼろのほん","すごくボロボロです。",2,990000,"./images","super_old_book.jpg","株式会社greenbook",now()),
      (4,"AppleWatch(Red)","あっぷるうぉっち（れっど）","高性能なスマートウォッチです。",3,82000,"./images","AppleWatchRed.jpg","株式会社green電気",now()),
      (5,"MacBookPro","まっくぶっくぷろ","革新的なデザインと機能を兼ね備えてます。",3,100000,"./images","MacBookPro.jpg","株式会社green電気",now()),
      (6,"ワイヤレスヘッドホン","わいやれすへっどほん","Bluetooth搭載のヘッドホンです。",3,19800,"./images","wireless_headphones.jpg","株式会社green電気",now()),
      (7,"一眼レフカメラ","いちがんれふかめら","本格的な写真撮影が出来ます。",3,98000,"./images","camera.jpg","株式会社green電気",now()),
      (8,"GAME BOY","げーむぼーい","童心に帰れます。",4,100,"./images","gameboy.jpg","株式会社toygreen",now()),
      (9,"けん玉","けんだま","童心に帰れます。",4,150,"./images","kendama.jpg","株式会社toygreen",now()),
      (10,"ときめきメモリアル","ときめきめもりある","伝説のゲームカセットです。",4,1000000,"./images","tokimeki_memorial.jpg","株式会社toygreen",now()),
      (11,"ハンドスピナー","はんどすぴなー","永遠に暇がつぶせます。",4,980,"./images","hand_spinner.jpg","株式会社toygreen",now()),
      (12,"ファミリーコンピューター","ふぁみりーこんぴゅーたー","童心に帰れます。",4,6000,"./images","family_computer.jpg","株式会社toygreen",now()),
      (13,"アロマキャンドル","あろまきゃんどる","魅惑的な香りをお楽しみいただけます。",5,980,"./images","aroma_candle.jpg","株式会社greengoods",now());
