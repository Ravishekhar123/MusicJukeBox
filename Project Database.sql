create database JukeBox;
use JukeBox;
drop table songs ;
drop table Songs1;
create table Song1(SongId int primary key,SongName varchar(60),ArtistName varchar(70),
AlbumName varchar(80),GenreName varchar(50),Duration double,Url longtext);
insert into Song1 value(1,'03Mitwaa','ShankarMahadevan','Kabhi AlvidhaNaaKehnaa',
'm1',06.24,'"C:\Users\LENOVO\Desktop\Songs\03Mitwaa.wav"');
insert into Song1 value(2,'AdhuraIshq','AltamashFaridi',
'Movie','m2',04.10,'"C:\Users\LENOVO\Desktop\Songs\AdhuraIshq.wav"');
insert into Song1 value(3,'Ae Dil Hai Mushkil','Pritam','Ae Dil Hai Mushkil','m3',04.26,'"C:\Users\LENOVO\Desktop\Songs\Ae Dil Hai Mushkil.wav"');
insert into Song1 value(4,'AgartumSaathHoo','ArjithSingh','Tanasha','m4',05.39,'"C:\Users\LENOVO\Desktop\Songs\AgarTumSaathHo.wav"');
insert into Song1 value(5,'ApdiPode','VidyaSagar','Gajini','m5',04.38,'"C:\Users\LENOVO\Desktop\Songs\ApdiPode.wav"');
insert into Song1 value(6,'AthilokaSundhari','Karthik','Sarrainodu','m6',04.13,'"C:\Users\LENOVO\Desktop\Songs\AthilokaSundari.wav"');
insert into Song1 value(7,'ChannaMerey','ArjithSigh','Ae Dil Hey Mushkil','m7', 04.47,'"C:\Users\LENOVO\Desktop\Songs\ChannaMerey.wav"');

select * from Song1;
Select * from song1 where  SongName  like '%AeDilHaiMushKil%';
select url from Song1 where SongId=3;


create table Playlist1(PlaylistId int primary key,
PlaylistName varchar(40),DateofCreation Date);
insert into Playlist1 value(1,'Sad','2023-05-07');
insert into Playlist1 value(3,'Happy','2023-08-09');
insert into Playlist1 values(4,'Romance','2023-03-04');
insert into Playlist1 value(5,'Item','2023-02-01');
insert into Playlist1 value(6,'Driving','2022-07-08');
insert into PlayList1 value(7,'WorkOut','2021-07-09');

select * from Playlist1;
drop table Playlist1;
select * from Playlist1;

create table JukeBoxinformation(Playlistsongid int primary key,SongId int,  
foreign key(SongId) references Song1(SongId), PlaylistId int,foreign key(PlaylistId) references Playlist1(PlaylistId));
insert into JukeBoxinformation value(1,2,6);
insert into JukeBoxinformation value(2,4,3);
insert into JukeBoxinformation value(3,5,6);
insert into JukeBoxinformation value(4,1,4);
insert into JukeBoxinformation value(5,3,1);
insert into JukeBoxinformation value(6,6,6);
insert into JukeBoxinformation value(7,7,7);
drop table JukeBoxinformation;
select * from JukeBoxinformation;