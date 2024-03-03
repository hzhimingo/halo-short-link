create table `account`
(
    `id`           bigint unsigned not null primary key comment '主键',
    `account_no`   bigint       default null comment '账户编号',
    `head_img`     varchar(255) default null comment '头像',
    `phone`        varchar(128) default null comment '手机号',
    `pwd`          varchar(128) default null comment '密码',
    `secret`       varchar(64)  default null comment '盐，用于处理个人敏感信息',
    `mail`         varchar(128) default null comment '邮箱',
    `username`     varchar(255) default null comment '用户名',
    `auth`         varchar(32)  default null comment '认证级别，DEFAULT, REALNAME, ENTERPRISE',
    `gmt_create`   datetime     default current_timestamp,
    `gmt_modified` datetime     default current_timestamp on update current_timestamp,
    unique key `uk_phone` (`phone`) using BTREE,
    unique key `uk_account` (`account_no`) using BTREE
);