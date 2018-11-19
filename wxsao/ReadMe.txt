一个拉起微信“扫一扫”功能的小demo
1 直接拉起微信“扫一扫”
2 通过辅助功能启动微信“扫一扫”

程序用到com.hs:app-release包拉起微信扫一扫，两种方式依赖
1 直接在工程dependencies中增加 implementation('com.hs:app-release:x.x.x')
2 下载com.hs离线包(app-release:x.x.x.jar)，放到工程libs下
  记得添加
  repositories {
      flatDir { dirs 'libs' }
  }

注意事项：
1 程序用到apache http，请添加useLibrary("org.apache.http.legacy")
2 在AndroidManifest.xml中添加两个权限
  <uses-permission android:name="android.permission.INTERNET" />
  <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />