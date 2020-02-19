create table item
(
    id          int auto_increment
        primary key,
    name        varchar(50)                                                                                                                                             not null,
    wow_head_id int                                                                                                                                                     null,
    slot        enum ('HEAD', 'NECK', 'SHOULDERS', 'BODY', 'CHEST', 'WAIST', 'LEGS', 'FEET', 'WRIST', 'HAND', 'RING', 'TRINKET', 'BACK', 'MAINHAND', 'OFFHAND', 'WARD') not null,
    phase       int                                                                                                                                                     null,
    source_id   int                                                                                                                                                     null,
    own         tinyint(1) default 0                                                                                                                                    null,
    constraint items_name_uindex
        unique (name),
    constraint items_sources_id_fk
        foreign key (source_id) references source (id)
            on delete set null
);

create table source
(
    id          int auto_increment
        primary key,
    type        enum ('DUNGEON', 'WORLDBOSS', 'RAID', 'PVP', 'QUEST', 'PROFESSION', 'CONTAINER') null,
    location    varchar(50)                                                                      null,
    target      varchar(50)                                                                      null,
    wow_head_id int                                                                              null,
    constraint sources_id_uindex
        unique (id)
);
