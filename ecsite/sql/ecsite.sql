set names utf8;
set foreign_key_checks = 0;

use ecsite;
alter table login_user_transaction add admin_flg varchar(1);

INSERT INTO login_user_transaction(login_id,login_pass,user_name,admin_flg)VALUES("admin","admin01","admin","1");