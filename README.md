# Java-ITP-W5-S6-PF-String

Kelas Introduction to Programming / Week 5 / Session 6

### Penjelasan:
- **Scanner scan**: Digunakan untuk membaca input dari pengguna.
- Definisi Variabel untuk menampung input dari user.
- Deklarasi variabel `flippedString` untuk menyimpan hasil dari string yang telah dibalik.
- Looping setiap karakter dalam string menggunakan `for (int i = 0; i < input.length(); i++)`
- Buat variabel `c` bertipe `char` untuk menampung input string.
- variabel `c` akan menampung karakter yang sudah diakses dengan kode `input.charAt(i)`, `charAt(i)` menandakan index karakter mana yang diakses.
- Masuk ke pengecekan:
  - cek apakah karakter huruf besar, jika iya ubah menjadi huruf kecil, cek dengan kode `Character.isUpperCase(c)`, jika iya ubah menjadi huruf kecil dengan kode `flippedString.append(Character.toLowerCase(c))`.
  - lanjut cek jika huruf kecil, ubah menjadi huruf besar, cek dengan kode `Character.isLowerCase(c)`, jika iya ubah menjadi huruf besar dengan kode `flippedString.append(Character.toUpperCase(c))`.
  - terakhir cek juga jika bukan huruf (seperti spasi), tetap tambahkan ke string, dengan kode `flippedString.append(c);`.
- Kemudian print hasilnya dan selesai.

Sekian.

Habib Azizul Haq  
(2702488253)
