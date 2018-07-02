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
| GET    | /Pengajar                   | Ambil data semua pengajar                           |
| GET    | /Pengajar/{id}              | Ambil data pengajar sesuai id                       |
| POST   | /Pengajar                   | Buat pengajar baru                                  |
| PUT    | /Pengajar/{id}              | Update pengajar sesuai id                           |
| DELETE | /Pengajar/{id}              | Hapus pengajar sesuai id                            |
|  POST  | /komunitas                  | Buat komunitas baru                                 |
| PUT    | /komunitas/{id}             | Update komunitas sesuai id                          |
| GET    | /komunitas                  | Ambil semua data komunitas                          |
| POST   | /Anggota                    | Buat user anggota baru                              |
| PUT    | /Anggota/{id}               | Update anggota sesuai id                            |
| GET    | /Anggota                    | Ambil semua data anggota                            |
| GET    | /Anggota/{id}               | Ambil data anggota sesuai id                        |
| DELETE | /Anggota/{id}               | Hapus anggota                                       |
| PUT    | //title/{id}                | update titile anggota sesuai id                     |
| PUT    | /updatePoints/{id}/{idEv}   | update point anggota sesuai id anggota dan id event |
| PUT    | /updateXP/{id}/{idEv}       | update xp anggota sesuai id anggota dan id event    |
| POST   | /Rewards                    | Buat rewards baru                                   |
| GET    | /Rewards                    | Ambil data semua reward                             |
| GET    | /Rewards/{id}               | Ambil data reward sesuai id reward                  |
| PUT    | /Rewards/{id}               | Ubah data reward sesuai id                          |
| DELETE | /Rewards/{id}               | Hapus reward sesuai id reward                       |
| PUT    | /giveReward/{id}/{idEv}     | mengurangi point anggota sesuai dengan id reward    |
| POST   | /gath                       | buat event gathering baru                           |
| GET    | /gath                       | ambil semua data gathering                          |
| GET    | /gath/{id}                  | ambil data gathering sesuai id                      |
| PUT    | /gath/{id}                  | update data gathering sesuai id                     |
| DELETE | /gath/{id}                  | hapus data gathering sesuai id                      |
| POST   | /challange                  | Buat event challange baru                           |
| GET    | /challange                  | Ambil data seluruh event challange                  |
| GET    | /challange/{id}             | ambil data challenge sesuai id challange            |
| PUT    | /challange/{id}             | update data challange sesuai id                     |
| DELETE | /challange/{id}             | hapus challange sesuai id                           |
| POST   | /RSVP                       | RSVP event                                          |
| GET    | /RSVP                       | Get data RSVP event                                 |
| POST   | /JoinKomunitas              | Gabung ke komunitas                                 |
| GET    | /DaftarKomunitas            | Ambil data daftar komunitas                         |
| POST   | /JoinEvent                  | Gabung ke event                                     |
| GET    | /DaftarEvent                | Ambil data seluruh daftar event                     |
| POST   | /inputReward                | Memasukan data penerima dan reward                  |
| GET    | /DaftarPenerima             | Ambil data penerima reward                          |
| POST   | /uploadFile                 | Memasukan satu file                                 |
| POST   | /uploadMultipleFiles        | Memasukan banyak file                               |
| GET    | /downloadFile/{fileName:.+} | Ambil file sesuai nama file                         |
| POST   | /gallery                    | Buat galery baru                                    |
| GET    | /gallery                    | Ambil data seluruh data gallery                     |
| GET    | /gallery/{id}               | ambil data gallery sesuai id gallery                |
| PUT    | /gallery/{id}               | update data gallery sesuai id                       |
| DELETE | /gallery/{id}               | hapus gallery sesuai id                             |
