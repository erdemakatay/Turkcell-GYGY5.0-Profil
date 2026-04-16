# 📱 Jetpack Compose Profil Kartı


Bu proje, modern Kotlin geliştirme araçları kullanılarak hazırlanmış,  kullanıcı dostu bir **Profil Kartı** uygulamasıdır. Kullanıcı bilgilerini ve teknik yetenekleri temiz bir arayüzle sunmayı hedefler.


## 📸 Uygulama Ekran Görünümü

<p align="center">
  <img src="https://github.com/user-attachments/assets/267044ed-b50a-435b-bea0-e84400683cc4" alt="Proje Ekran Görüntüsü" width="300" />
</p>

## 🚀 Özellikler
* **Modern UI:** Material 3 prensiplerine uygun, sade ve estetik tasarım.
* **Dinamik Liste:** `LazyColumn` kullanılarak optimize edilmiş yetenek listesi.
* **Custom Components:** Tekrar kullanılabilir `SkillCard` ve `ProfileCard` bileşenleri.
* **Edge-to-Edge:** Tam ekran deneyimi sağlayan modern yerleşim.

## 🛠 Kullanılan Teknolojiler ve Yapılar

| Teknoloji | Açıklama |
| :--- | :--- |
| **Kotlin** | Uygulamanın temel programlama dili. |
| **Jetpack Compose** |  UI geliştirme framework'ü. |
| **LazyColumn** | Performanslı liste yönetimi (RecyclerView'un modern alternatifi). |
| **Modifier System** | Boyutlandırma, hizalama ve stil işlemleri için kullanıldı. |
| **Custom Shapes** | `CircleShape` ve `RoundedCornerShape` ile özelleştirilmiş bileşenler. |



## 💻 Kod Yapısı

Proje temel olarak iki ana `@Composable` fonksiyondan oluşmaktadır:

1. **`ProfileCard`**: Profil fotoğrafı (baş harfler), isim, üniversite ve meslek bilgilerini dikey bir hiyerarşide (`Column`) tutar.
2. **`SkillCard`**: Her bir yeteneği  bir satır (`Row`) ve başında bir indikator noktasıyla render eder.

## ⚙️ Kurulum
1. Bu depoyu klonlayın.
2. Android Studio  ile projeyi açın.
3. Bağımlılıkların yüklenmesini bekleyin ve uygulamayı bir emülatör veya fiziksel cihazda çalıştırın.
