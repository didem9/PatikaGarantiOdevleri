# PatikaGarantiOdevleri

Bu repoda Patika.dev ve Garanti BBVA tarafından düzenlenen bootcamp'in cumartesi derslerinin ödevleri bulunmaktadır.

HAFTA2_ÖDEV:  PhoneApp

  inheritance ile class tanımlama

HAFTA3_ÖDEV:  Game Controller

  Xbox ve Playstation olmak üzere 2 adet oyun kontrolcüsü vardır.  Bu cihazlar diğer platformlarda çalışamıyor. Yani XBOX sadece XBOX’da, 
  Playstation sadece Playstation’da çalışabiliyor. Fakat bu iki cihaz da kablo yardımıyla bilgisayara bağlanırsa, çalışabiliyor.              Bilmeyenler için not -> Örneğin Fifa oynayacaksınız. Birisi pas tuşu, birisi şut tuşu, birisi ara pas tuşu, birisi de orta açma tuşu.
  Tuşların ortak yanlarını da düşünerek;

    1. GameController adında bir interface oluşturun.
    2. Bu interface i XBOX ve Playstation için implemente eden 2 adet class yazın.
    3. Xbox, Playstation ve Computer adında 3 sınıf oluşturun.
    4. Bu sınıfların open ve shutdown metotları olsun. Eğer açıksa ve open metodu çalıştırılıyorsa zaten açık gibi bir exception fırlatın. Ya da kapalıysa, cihaz kapalıdır mesajını fırlatın.
    5. Bu sınıflarda addController metodu olsun.
    6. Bu sınıflarda playGame metodu olsun ve tüm classlar için konsola “oyun başladı” yazsın.
  Eğer cihaz kapalıysa zaten kapalıdır exception u fırlatın.
  NOT: Bu işlemleri abstact - interface mantığını iyi düşünerek yapın.

  HAFTA4_ÖDEV:  Futbol İstatistik Uygulaması
        
    Country: id, name
    Lig: id, adı, id_country(hangi ülkenin ligi)
    Takim: id, adı, id_leauge, kuruluş yılı, attığı gol, yediği gol, puan, seviye(1=en üst lig, 2, onun bir alt ligi gibi)
    Oyuncu: id, adı, soyadı, id_team, id_country(nereli), attığı gol

      1. Yukarıdaki tabloların create scriptlerini oluşturunuz.
      2. Bu tabloları dolduran insert scriptler yazınız. Ligi olmayan takım
      3. İsmi “Türkiye” olan ülkenin liglerinin listesini getiren scripti yazınız.
      4. İsmi “Türkiye” olan ülkenin takımların listesini getiren scripti yazınız.
      5. İsmi “Türkiye” olan en üst seviyeli ligdeki puan tablosunu getiren scripti yazınız.
      6. Türkiye liglerindeki puan ortalamalarını gösteren scrpiti yazınız.
      7. Bir ligin Gol kralını getiren scprit yazınız. (oyuncu adı, soyadı, takım adı, nereli olduğu)
      8. Tüm liglerde attığı gol yediği golden daha küçük olan takımları getiren scripti yazınız.
      9. Bir takımın oyuncularının toplam gol sayısını ve takımın gol sayısını yan yana getiren bir scprit yazınız. (kontrol sorgusu gibi, birisi takım verisi, diğeri oyuncuların toplamı olacak)
