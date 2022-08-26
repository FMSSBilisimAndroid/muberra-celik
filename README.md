# muberra-celik

## Tools Namespace Nedir?
Android Studio, tools namespace ile tasarım zamanı özelliklerini (bir parçada hangi düzenin gösterileceği gibi) veya derleme zamanı davranışlarını (XML kaynaklarında hangi küçültme modunun uygulanacağı gibi) etkinleştiren çeşitli XML özniteliklerini destekler. Kısacası uygulama geliştirirken tasarım tarafında yapılan değişikliklerin çıktısını uygulamayı çalıştırmadan anında görebilmek tools attribute sayesinde mümkün.

Uygulama derendiğinde, derleme araçları bu özellikleri kaldırır, böylece APK boyutunuz veya çalışma zamanı davranışınız üzerinde hiçbir etkisi olmaz.

## Tools Namespace Örneği

```
<GridLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    tools:targetApi="14" >
```

