package defpackage;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: wi3  reason: default package */
public final class wi3 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ wi3(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v34, types: [u5e, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v46 */
    /* JADX WARNING: type inference failed for: r1v47 */
    /* JADX WARNING: type inference failed for: r1v48 */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x022b, code lost:
        r1 = (com.google.android.material.appbar.AppBarLayout$BaseBehavior) r8.o;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0213 A[SYNTHETIC, Splitter:B:77:0x0213] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x021c A[SYNTHETIC, Splitter:B:82:0x021c] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            r0 = 5
            r1 = 0
            r2 = 1
            r3 = 0
            int r4 = r8.a
            switch(r4) {
                case 0: goto L_0x0278;
                case 1: goto L_0x0261;
                case 2: goto L_0x0225;
                case 3: goto L_0x01cc;
                case 4: goto L_0x01b2;
                case 5: goto L_0x0195;
                case 6: goto L_0x0183;
                case 7: goto L_0x014e;
                case 8: goto L_0x008f;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r8.b
            r43 r4 = (defpackage.r43) r4
            java.lang.String r5 = "google.message_id"
            android.content.Intent r6 = r4.a
            java.lang.String r5 = r6.getStringExtra(r5)
            if (r5 != 0) goto L_0x001d
            java.lang.String r5 = "message_id"
            java.lang.String r5 = r6.getStringExtra(r5)
        L_0x001d:
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0028
            ukg r1 = defpackage.j1e.r(r1)
            goto L_0x007d
        L_0x0028:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "google.message_id"
            android.content.Intent r7 = r4.a
            java.lang.String r6 = r7.getStringExtra(r6)
            if (r6 != 0) goto L_0x003d
            java.lang.String r6 = "message_id"
            java.lang.String r6 = r7.getStringExtra(r6)
        L_0x003d:
            java.lang.String r7 = "google.message_id"
            r5.putString(r7, r6)
            android.content.Intent r4 = r4.a
            java.lang.String r6 = "google.product_id"
            boolean r7 = r4.hasExtra(r6)
            if (r7 == 0) goto L_0x0054
            int r1 = r4.getIntExtra(r6, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0054:
            if (r1 == 0) goto L_0x005f
            java.lang.String r4 = "google.product_id"
            int r1 = r1.intValue()
            r5.putInt(r4, r1)
        L_0x005f:
            java.lang.String r1 = "supports_message_handled"
            r5.putBoolean(r1, r2)
            java.lang.Object r1 = r8.c
            android.content.Context r1 = (android.content.Context) r1
            pkg r1 = defpackage.pkg.f(r1)
            ckg r4 = new ckg
            monitor-enter(r1)
            int r6 = r1.b     // Catch:{ all -> 0x008c }
            int r2 = r2 + r6
            r1.b = r2     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            r2 = 2
            r4.<init>(r6, r2, r5, r3)
            ukg r1 = r1.h(r4)
        L_0x007d:
            ok4 r2 = defpackage.ok4.c
            qje r3 = new qje
            java.lang.Object r8 = r8.o
            java.util.concurrent.CountDownLatch r8 = (java.util.concurrent.CountDownLatch) r8
            r3.<init>(r0, r8)
            r1.b(r2, r3)
            return
        L_0x008c:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008c }
            throw r8
        L_0x008f:
            die r0 = new die
            java.lang.Object r1 = r8.c
            android.content.Context r1 = (android.content.Context) r1
            r4 = 9
            r0.<init>((android.content.Context) r1, (int) r4)
            java.lang.Object r1 = r8.b
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.String r1 = r1.toString()
            v9g r4 = new v9g
            r4.<init>(r8)
            java.lang.String r8 = "\\"
            java.lang.String r5 = "\\\\"
            java.lang.String r8 = r1.replace(r8, r5)
            java.lang.String r1 = "'"
            java.lang.String r5 = "\\'"
            java.lang.String r8 = r8.replace(r1, r5)
            java.lang.String r1 = "</"
            java.lang.String r5 = "<\\/"
            java.lang.String r8 = r8.replace(r1, r5)
            java.lang.String r1 = "\n"
            java.lang.String r5 = "\\n"
            java.lang.String r8 = r8.replace(r1, r5)
            java.lang.String r1 = "\r"
            java.lang.String r5 = "\\r"
            java.lang.String r8 = r8.replace(r1, r5)
            java.lang.String r1 = "evgeniiJsEvaluator.returnResultToJava(eval('try{"
            java.lang.String r5 = "}catch(e){\"evgeniiJsEvaluatorException\"+e}'));"
            java.lang.String r8 = defpackage.zr6.i(r1, r8, r5)
            java.lang.Object r1 = r0.c
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            r1.set(r4)
            java.lang.Object r1 = r0.a
            u5e r1 = (defpackage.u5e) r1
            if (r1 != 0) goto L_0x010f
            u5e r1 = new u5e
            r1.<init>()
            android.webkit.WebView r4 = new android.webkit.WebView
            java.lang.Object r5 = r0.b
            android.content.Context r5 = (android.content.Context) r5
            r4.<init>(r5)
            r1.a = r4
            r4.setWillNotDraw(r2)
            android.webkit.WebSettings r5 = r4.getSettings()
            r5.setJavaScriptEnabled(r2)
            java.lang.String r2 = "utf-8"
            r5.setDefaultTextEncodingName(r2)
            ru.ok.messages.video.fetcher.youtube.js.JavaScriptInterface r2 = new ru.ok.messages.video.fetcher.youtube.js.JavaScriptInterface
            r2.<init>(r0)
            java.lang.String r5 = "evgeniiJsEvaluator"
            r4.addJavascriptInterface(r2, r5)
            r0.a = r1
        L_0x010f:
            java.lang.Object r0 = r0.a
            u5e r0 = (defpackage.u5e) r0
            r0.getClass()
            java.lang.String r1 = "data:text/html;charset=utf-8;base64,"
            java.lang.String r2 = "<script>"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0149 }
            r4.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x0149 }
            r4.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x0149 }
            java.lang.String r8 = "</script>"
            r4.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x0149 }
            java.lang.String r8 = r4.toString()     // Catch:{ UnsupportedEncodingException -> 0x0149 }
            java.lang.String r2 = "UTF-8"
            byte[] r8 = r8.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x0149 }
            java.lang.String r8 = android.util.Base64.encodeToString(r8, r3)     // Catch:{ UnsupportedEncodingException -> 0x0149 }
            java.lang.Object r0 = r0.a     // Catch:{ UnsupportedEncodingException -> 0x0149 }
            android.webkit.WebView r0 = (android.webkit.WebView) r0     // Catch:{ UnsupportedEncodingException -> 0x0149 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0149 }
            r2.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x0149 }
            r2.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x0149 }
            java.lang.String r8 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0149 }
            r0.loadUrl(r8)     // Catch:{ UnsupportedEncodingException -> 0x0149 }
            goto L_0x014d
        L_0x0149:
            r8 = move-exception
            r8.printStackTrace()
        L_0x014d:
            return
        L_0x014e:
            java.lang.Object r0 = r8.b
            ry1 r0 = (defpackage.ry1) r0
            boolean r1 = r0.isActive()     // Catch:{ all -> 0x0164 }
            if (r1 == 0) goto L_0x0182
            java.lang.Object r1 = r8.c     // Catch:{ all -> 0x0164 }
            bm7 r1 = (defpackage.bm7) r1     // Catch:{ all -> 0x0164 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0164 }
            r0.resumeWith(r1)     // Catch:{ all -> 0x0164 }
            goto L_0x0182
        L_0x0164:
            r1 = move-exception
            java.lang.Object r8 = r8.o
            ejf r8 = (defpackage.ejf) r8
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r2 = r1.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            defpackage.hm9.r(r8, r1, r2, r3)
            njc r8 = new njc
            r8.<init>(r1)
            r0.resumeWith(r8)
        L_0x0182:
            return
        L_0x0183:
            java.lang.Object r0 = r8.b
            s7g r0 = (defpackage.s7g) r0
            y9b r0 = r0.f
            java.lang.Object r1 = r8.c
            yzd r1 = (defpackage.yzd) r1
            java.lang.Object r8 = r8.o
            glc r8 = (defpackage.glc) r8
            r0.h(r1, r8)
            return
        L_0x0195:
            java.lang.Object r0 = r8.b     // Catch:{ Exception -> 0x019d }
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch:{ Exception -> 0x019d }
            java.lang.Object r1 = r0.call()     // Catch:{ Exception -> 0x019d }
        L_0x019d:
            h76 r0 = new h76
            java.lang.Object r2 = r8.c
            tj3 r2 = (defpackage.tj3) r2
            nu4 r2 = (defpackage.nu4) r2
            r3 = 19
            r0.<init>(r2, r3, r1)
            java.lang.Object r8 = r8.o
            android.os.Handler r8 = (android.os.Handler) r8
            r8.post(r0)
            return
        L_0x01b2:
            java.lang.Object r0 = r8.o     // Catch:{ InterruptedException | ExecutionException -> 0x01c0 }
            bm7 r0 = (defpackage.bm7) r0     // Catch:{ InterruptedException | ExecutionException -> 0x01c0 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x01c0 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ InterruptedException | ExecutionException -> 0x01c0 }
            boolean r2 = r0.booleanValue()     // Catch:{ InterruptedException | ExecutionException -> 0x01c0 }
        L_0x01c0:
            java.lang.Object r0 = r8.b
            w45 r0 = (defpackage.w45) r0
            java.lang.Object r8 = r8.c
            l7g r8 = (defpackage.l7g) r8
            r0.b(r8, r2)
            return
        L_0x01cc:
            java.lang.Object r2 = r8.b
            yq6 r2 = (defpackage.yq6) r2
            java.lang.Object r3 = r8.c
            h7b r3 = (defpackage.h7b) r3
            java.lang.Object r8 = r8.o
            zq6 r8 = (defpackage.zq6) r8
            r8.getClass()
            eab r4 = r2.b     // Catch:{ IOException -> 0x020c, all -> 0x0209 }
            oj0 r4 = (defpackage.oj0) r4     // Catch:{ IOException -> 0x020c, all -> 0x0209 }
            wv6 r4 = r4.a     // Catch:{ IOException -> 0x020c, all -> 0x0209 }
            android.net.Uri r4 = r4.b     // Catch:{ IOException -> 0x020c, all -> 0x0209 }
            java.net.HttpURLConnection r0 = r8.c0(r4, r0)     // Catch:{ IOException -> 0x020c, all -> 0x0209 }
            hc9 r8 = r8.p     // Catch:{ IOException -> 0x01fc }
            long r4 = r8.now()     // Catch:{ IOException -> 0x01fc }
            r2.e = r4     // Catch:{ IOException -> 0x01fc }
            if (r0 == 0) goto L_0x01fe
            java.io.InputStream r1 = r0.getInputStream()     // Catch:{ IOException -> 0x01fc }
            r8 = -1
            r3.t(r1, r8)     // Catch:{ IOException -> 0x01fc }
            goto L_0x01fe
        L_0x01fa:
            r8 = move-exception
            goto L_0x021a
        L_0x01fc:
            r8 = move-exception
            goto L_0x020e
        L_0x01fe:
            if (r1 == 0) goto L_0x0203
            r1.close()     // Catch:{ IOException -> 0x0203 }
        L_0x0203:
            if (r0 == 0) goto L_0x0219
        L_0x0205:
            r0.disconnect()
            goto L_0x0219
        L_0x0209:
            r8 = move-exception
            r0 = r1
            goto L_0x021a
        L_0x020c:
            r8 = move-exception
            r0 = r1
        L_0x020e:
            r3.d(r8)     // Catch:{ all -> 0x01fa }
            if (r1 == 0) goto L_0x0216
            r1.close()     // Catch:{ IOException -> 0x0216 }
        L_0x0216:
            if (r0 == 0) goto L_0x0219
            goto L_0x0205
        L_0x0219:
            return
        L_0x021a:
            if (r1 == 0) goto L_0x021f
            r1.close()     // Catch:{ IOException -> 0x021f }
        L_0x021f:
            if (r0 == 0) goto L_0x0224
            r0.disconnect()
        L_0x0224:
            throw r8
        L_0x0225:
            java.lang.Object r0 = r8.c
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x0260
            java.lang.Object r1 = r8.o
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r1 = (com.google.android.material.appbar.AppBarLayout$BaseBehavior) r1
            android.widget.OverScroller r2 = r1.d
            if (r2 == 0) goto L_0x0260
            boolean r2 = r2.computeScrollOffset()
            java.lang.Object r3 = r8.b
            androidx.coordinatorlayout.widget.CoordinatorLayout r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r3
            if (r2 == 0) goto L_0x024c
            android.widget.OverScroller r2 = r1.d
            int r2 = r2.getCurrY()
            r1.K(r3, r0, r2)
            java.util.WeakHashMap r1 = defpackage.zmf.a
            r0.postOnAnimation(r8)
            goto L_0x0260
        L_0x024c:
            fm r0 = (defpackage.fm) r0
            r1.L(r3, r0)
            boolean r8 = r0.z0
            if (r8 == 0) goto L_0x0260
            android.view.View r8 = com.google.android.material.appbar.AppBarLayout$BaseBehavior.C(r3)
            boolean r8 = r0.h(r8)
            r0.g(r8)
        L_0x0260:
            return
        L_0x0261:
            java.lang.Object r0 = r8.o
            d55 r0 = (defpackage.d55) r0
            java.lang.Object r1 = r8.c
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            zl4 r0 = r0.b(r1)
            java.lang.Object r8 = r8.b
            uy1 r8 = (defpackage.uy1) r8
            r8.getClass()
            defpackage.dm4.c(r8, r0)
            return
        L_0x0278:
            java.lang.Object r0 = r8.o
            android.content.BroadcastReceiver$PendingResult r0 = (android.content.BroadcastReceiver.PendingResult) r0
            java.lang.Object r1 = r8.c
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r8 = r8.b
            android.content.Intent r8 = (android.content.Intent) r8
            java.lang.String r2 = "Updating proxies: (BatteryNotLowProxy ("
            java.lang.String r4 = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"
            boolean r4 = r8.getBooleanExtra(r4, r3)     // Catch:{ all -> 0x02e8 }
            java.lang.String r5 = "KEY_BATTERY_CHARGING_PROXY_ENABLED"
            boolean r5 = r8.getBooleanExtra(r5, r3)     // Catch:{ all -> 0x02e8 }
            java.lang.String r6 = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"
            boolean r6 = r8.getBooleanExtra(r6, r3)     // Catch:{ all -> 0x02e8 }
            java.lang.String r7 = "KEY_NETWORK_STATE_PROXY_ENABLED"
            boolean r8 = r8.getBooleanExtra(r7, r3)     // Catch:{ all -> 0x02e8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02e8 }
            r3.<init>(r2)     // Catch:{ all -> 0x02e8 }
            r3.append(r4)     // Catch:{ all -> 0x02e8 }
            java.lang.String r2 = "), BatteryChargingProxy ("
            r3.append(r2)     // Catch:{ all -> 0x02e8 }
            r3.append(r5)     // Catch:{ all -> 0x02e8 }
            java.lang.String r2 = "), StorageNotLowProxy ("
            r3.append(r2)     // Catch:{ all -> 0x02e8 }
            r3.append(r6)     // Catch:{ all -> 0x02e8 }
            java.lang.String r2 = "), NetworkStateProxy ("
            r3.append(r2)     // Catch:{ all -> 0x02e8 }
            r3.append(r8)     // Catch:{ all -> 0x02e8 }
            java.lang.String r2 = "), "
            r3.append(r2)     // Catch:{ all -> 0x02e8 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x02e8 }
            a14 r3 = defpackage.a14.u()     // Catch:{ all -> 0x02e8 }
            java.lang.String r7 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.a     // Catch:{ all -> 0x02e8 }
            r3.n(r7, r2)     // Catch:{ all -> 0x02e8 }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy> r2 = androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy.class
            defpackage.woa.a(r1, r2, r4)     // Catch:{ all -> 0x02e8 }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy> r2 = androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy.class
            defpackage.woa.a(r1, r2, r5)     // Catch:{ all -> 0x02e8 }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy> r2 = androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy.class
            defpackage.woa.a(r1, r2, r6)     // Catch:{ all -> 0x02e8 }
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy> r2 = androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy.class
            defpackage.woa.a(r1, r2, r8)     // Catch:{ all -> 0x02e8 }
            r0.finish()
            return
        L_0x02e8:
            r8 = move-exception
            r0.finish()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi3.run():void");
    }

    public /* synthetic */ wi3(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.o = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ wi3(Context context, r43 r43, CountDownLatch countDownLatch) {
        this.a = 9;
        this.c = context;
        this.b = r43;
        this.o = countDownLatch;
    }

    public /* synthetic */ wi3(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public wi3(w9g w9g, Context context, StringBuilder sb) {
        this.a = 8;
        this.o = w9g;
        this.c = context;
        this.b = sb;
    }
}
