# PatikaGarantiOdevleri

Bu repoda Patika.dev ve Garanti BBVA tarafından düzenlenen bootcamp'in cumartesi derslerinin ödevleri bulunmaktadır.

Hafta2_Odev: Inheritance ile class tanımlama 

Hafta3_Odev: 2 adet oyun kontrolcüsü var. Birisi XBOX’ın birisi de Playstation’ın. Bu cihazlar diğer platformlarda çalışamıyor. Yani XBOX sadece XBOX’da,                 Playstation sadece Playstation’da çalışabiliyor. Fakat bu iki cihaz da kablo yardımıyla bilgisayara bağlanırsa, çalışabiliyor. Bilmeyenler için              not -> Örneğin Fifa oynayacaksınız. Birisi pas tuşu, birisi şut tuşu, birisi ara pas tuşu, birisi de orta açma tuşu.
  Tuşların ortak yanlarını da düşünerek;
    1. GameController adında bir interface oluşturun.
    2. Bu interface i XBOX ve Playstation için implemente eden 2 adet class yazın.
    3. Xbox, Playstation ve Computer adında 3 sınıf oluşturun.
    4. Bu sınıfların open ve shutdown metotları olsun. Eğer açıksa ve open metodu çalıştırılıyorsa zaten açık gibi bir exception fırlatın. Ya da kapalıysa, cihaz kapalıdır mesajını fırlatın.
    4. Bu sınıflarda addController metodu olsun.
    5. Bu sınıflarda playGame metodu olsun ve tüm classlar için konsola “oyun başladı” yazsın.
    Eğer cihaz kapalıysa zaten kapalıdır exception u fırlatın.
    NOT: Bu işlemleri abstact - interface mantığını iyi düşünerek yapın.
