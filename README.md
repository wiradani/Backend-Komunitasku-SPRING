# Backend-Komunitasku-SPRING
backend aplikasi komunitasku menggunakan spring boot java

### Install database 
1. masuk kedalam http://localhost/phpmyadmin
2. buat database baru dengan nama "backendAPI"
3. import file "backendAPI.sql"

### Cara menjalankan
1. masuk kedalam folder "backendAPI"
2. buka terminal dan jalankan
```
$ ./gradlew bootRun
```

### List API
| Method | Link                                                 | Description                                         |
|--------|------------------------------------------------------|-----------------------------------------------------|
| GET    | http://64.56.78.116:8080/Pengajar                   | Ambil data semua pengajar                           |
| GET    | http://64.56.78.116:8080/Pengajar/{id}              | Ambil data pengajar sesuai id                       |
| POST   | http://64.56.78.116:8080/Pengajar                   | Buat pengajar baru                                  |
| PUT    | http://64.56.78.116:8080/Pengajar/{id}              | Update pengajar sesuai id                           |
| DELETE | http://64.56.78.116:8080/Pengajar/{id}              | Hapus pengajar sesuai id                            |
|  POST  | http://64.56.78.116:8080/komunitas                  | Buat komunitas baru                                 |
| PUT    | http://64.56.78.116:8080/komunitas/{id}             | Update komunitas sesuai id                          |
| GET    | http://64.56.78.116:8080/komunitas                  | Ambil semua data komunitas                          |
| POST   | http://64.56.78.116:8080/Anggota                    | Buat user anggota baru                              |
| PUT    | http://64.56.78.116:8080/Anggota/{id}               | Update anggota sesuai id                            |
| GET    | http://64.56.78.116:8080/Anggota                    | Ambil semua data anggota                            |
| GET    | http://64.56.78.116:8080/Anggota/{id}               | Ambil data anggota sesuai id                        |
| DELETE | http://64.56.78.116:8080/Anggota/{id}               | Hapus anggota                                       |
| PUT    | http://64.56.78.116:8080//title/{id}                | update titile anggota sesuai id                     |
| PUT    | http://64.56.78.116:8080/updatePoints/{id}/{idEv}   | update point anggota sesuai id anggota dan id event |
| PUT    | http://64.56.78.116:8080/updateXP/{id}/{idEv}       | update xp anggota sesuai id anggota dan id event    |
| POST   | http://64.56.78.116:8080/Rewards                    | Buat rewards baru                                   |
| GET    | http://64.56.78.116:8080/Rewards                    | Ambil data semua reward                             |
| GET    | http://64.56.78.116:8080/Rewards/{id}               | Ambil data reward sesuai id reward                  |
| PUT    | http://64.56.78.116:8080/Rewards/{id}               | Ubah data reward sesuai id                          |
| DELETE | http://64.56.78.116:8080/Rewards/{id}               | Hapus reward sesuai id reward                       |
| PUT    | http://64.56.78.116:8080/giveReward/{id}/{idEv}     | mengurangi point anggota sesuai dengan id reward    |
| POST   | http://64.56.78.116:8080/gath                       | buat event gathering baru                           |
| GET    | http://64.56.78.116:8080/gath                       | ambil semua data gathering                          |
| GET    | http://64.56.78.116:8080/gath/{id}                  | ambil data gathering sesuai id                      |
| PUT    | http://64.56.78.116:8080/gath/{id}                  | update data gathering sesuai id                     |
| DELETE | http://64.56.78.116:8080/gath/{id}                  | hapus data gathering sesuai id                      |
| POST   | http://64.56.78.116:8080/challange                  | Buat event challange baru                           |
| GET    | http://64.56.78.116:8080/challange                  | Ambil data seluruh event challange                  |
| GET    | http://64.56.78.116:8080/challange/{id}             | ambil data challenge sesuai id challange            |
| PUT    | http://64.56.78.116:8080/challange/{id}             | update data challange sesuai id                     |
| DELETE | http://64.56.78.116:8080/challange/{id}             | hapus challange sesuai id                           |
| POST   | http://64.56.78.116:8080/RSVP                       | RSVP event                                          |
| GET    | http://64.56.78.116:8080/RSVP                       | Get data RSVP event                                 |
| POST   | http://64.56.78.116:8080/JoinKomunitas              | Gabung ke komunitas                                 |
| GET    | http://64.56.78.116:8080/DaftarKomunitas            | Ambil data daftar komunitas                         |
| POST   | http://64.56.78.116:8080/JoinEvent                  | Gabung ke event                                     |
| GET    | http://64.56.78.116:8080/DaftarEvent                | Ambil data seluruh daftar event                     |
| POST   | http://64.56.78.116:8080/inputReward                | Memasukan data penerima dan reward                  |
| GET    | http://64.56.78.116:8080/DaftarPenerima             | Ambil data penerima reward                          |
| POST   | http://64.56.78.116:8080/uploadFile                 | Memasukan satu file                                 |
| POST   | http://64.56.78.116:8080/uploadMultipleFiles        | Memasukan banyak file                               |
| GET    | http://64.56.78.116:8080/downloadFile/{fileName:.+} | Ambil file sesuai nama file                         |
| POST   | http://64.56.78.116:8080/gallery                    | Buat galery baru                                    |
| GET    | http://64.56.78.116:8080/gallery                    | Ambil data seluruh data gallery                     |
| GET    | http://64.56.78.116:8080/gallery/{id}               | ambil data gallery sesuai id gallery                |
| PUT    | http://64.56.78.116:8080/gallery/{id}               | update data gallery sesuai id                       |
| DELETE | http://64.56.78.116:8080/gallery/{id}               | hapus gallery sesuai id                             |
