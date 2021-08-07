insert into role(id, role_name)
values (1, 'DIRECTOR'),
       (2, 'MANAGER'),
       (3, 'WORKER');
insert into users(id,account_non_expired,account_non_locked,create_at,credentials_non_expired,email_code,first_name,last_name,password,email,enabled)
values ('4fec9206-f697-11eb-9a03-0242ac130003',true,true,'2021-08-06',true,'d9da3ee6-f697-11eb-9a03-0242ac130003','Bekzod','Sattorov','27061997','sattorovbekzodjondev97@gmail.com',true);
insert into users_roles(users_id, roles_id) values ('4fec9206-f697-11eb-9a03-0242ac130003',1);
