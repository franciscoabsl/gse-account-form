create index IX_C07375D7 on AMF_Account (_userName[$COLUMN_LENGTH:16$]);
create index IX_8987723C on AMF_Account (groupId);
create index IX_5147A8A2 on AMF_Account (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_9485EFA4 on AMF_Account (uuid_[$COLUMN_LENGTH:75$], groupId);