
create schema if not exists appointments;

use appointments;

create user 'rama'@'localhost' identified by 'rama';

GRANT ALL PRIVILEGES ON * . * TO 'rama'@'localhost';

FLUSH PRIVILEGES;
