package one.me.android;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LruCache;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\t8\nX\u0002²\u0006\u000e\u0010\f\u001a\u0004\u0018\u00010\u000b8\nX\u0002"}, d2 = {"Lone/me/android/OneMeApplication;", "Landroid/app/Application;", "Lke3;", "Leke;", "", "Lri6;", "Lsi6;", "<init>", "()V", "Lkye;", "tracer", "Lpye;", "report", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
public final class OneMeApplication extends Application implements ke3, eke, ri6, si6 {
    public static final /* synthetic */ int s0 = 0;
    public final long X = SystemClock.elapsedRealtime();
    public final String Y;
    public final khe Z;
    public final je7 a = tu0.r(3, new j78(28));
    public final yo b = yo.a;
    public final ArrayList c = new ArrayList();
    public final khe o = new khe(new j78(29));

    public OneMeApplication() {
        String name = OneMeApplication.class.getName();
        this.Y = name;
        Looper.getMainLooper();
        new hx7();
        cta cta = cta.APP_INIT;
        yo.b.k(cta, new bta(cta, SystemClock.elapsedRealtime()));
        hm9.m = new zba();
        int i = i9e.a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, "AppVersion 25.8.1(6392)--1", (Throwable) null);
        }
        this.Z = new khe(new p4a(this, 4));
    }

    public final me3 a() {
        return (me3) y8a.a.getAccessor().c(me3.class);
    }

    public final void attachBaseContext(Context context) {
        int i = lz7.g;
        if (!oag.t("ru")) {
            Locale locale = new Locale("ru");
            Locale.setDefault(locale);
            Configuration configuration = new Configuration();
            configuration.fontScale = 0.0f;
            configuration.setLocale(locale);
            configuration.setLayoutDirection(locale);
            context = context.createConfigurationContext(configuration);
        }
        super.attachBaseContext(context);
        if (!ProcessPhoenix.a(this)) {
            c5a c5a = new c5a(context, this);
            mqd.a = mqd.s(c5a);
            ly5 c2 = c();
            yf3 yf3 = new yf3(c5a, 22, this);
            nz4 nz4 = nz4.a;
            iy5 a2 = c2.a("Tracer", nz4, yf3);
            ArrayList arrayList = this.c;
            arrayList.add(a2);
            iy5 a3 = c().a("Scout", Collections.singletonList(a2), new ej4(this, c5a));
            arrayList.add(a3);
            arrayList.add(c().a("Protobuf", Collections.singletonList(a2), new j78(21)));
            b(c(), "LibraryUpgrade", nz4, new p4a(this, 0));
            c().a("Account", Collections.singletonList(a3), new j78(24));
            b(c(), "AnrWatcher", nz4, new p4a(this, 1));
            iy5 unused = c().a("SetupRx", nz4.a, new j78(25));
            iy5 unused2 = c().a("RxJavaPlugins.setErrorHandler", nz4.a, new p4a(this, 2));
            iy5 a4 = c().a("Chroma.init", nz4, new p4a(this, 3));
            b(c(), "AppTracerCrashService", nz4, new j78(26));
            b(c(), "IoPoolSize", Collections.singletonList(b(c(), "Logger", nz4, new j78(27))), new q4a(0));
            b(c(), "Fresco", nz4, new q4a(8));
            b(c(), "Theme background warmup", nz4, new p4a(this, 14));
            b(c(), "Chroma.dynamicChange", Collections.singletonList(a4), new p4a(this, 15));
            b(c(), "DynamicFont", nz4, new p4a(this, 18));
            b(c(), "NativeMedia", nz4, new q4a(28));
            b(c(), "EmojiProvider", nz4, new q4a(29));
            b(c(), "Animoji warmup", nz4, new s4a(0));
            b(c(), "VisibilityController", nz4, new j78(19));
            b(c(), "ProxyChangeListener", nz4, new j78(20));
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            iy5 b2 = b(c(), "InitialDataStorage.Banners", nz4, new zj7(14, atomicBoolean));
            AtomicReference atomicReference = new AtomicReference(Boolean.FALSE);
            b(c(), "LegacyChats", y53.M(b(c(), "InitialDataStorage.Chats&Folders", Collections.singletonList(b2), new jw3(atomicReference, 1)), b2), new a81(this, atomicBoolean, atomicReference, 4));
            b(c(), "RemoveAccountIfNeed", nz4, new j78(22));
            b(c(), "Folders Warmup", nz4, new j78(23));
        }
    }

    public final iy5 b(ly5 ly5, String str, Iterable iterable, k56 k56) {
        ArrayList arrayList = this.c;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (tpa.f(((iy5) it.next()).a, str)) {
                    throw new IllegalStateException(("Task " + str + " is root").toString());
                }
            }
        }
        return ly5.a(str, x53.t0(arrayList, iterable), k56);
    }

    public final ly5 c() {
        return (ly5) this.a.getValue();
    }

    public final Context getApplicationContext() {
        Context applicationContext = super.getApplicationContext();
        return applicationContext == null ? this : applicationContext;
    }

    public final SharedPreferences getSharedPreferences(String str, int i) {
        sld sld = (sld) this.Z.getValue();
        return (SharedPreferences) ((ConcurrentHashMap) sld.b.getValue()).computeIfAbsent(str, new di(19, new k5d((Object) sld, str, 2)));
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ee3 ee3 = (ee3) this.o.getValue();
        ee3.getClass();
        boolean z = (configuration.uiMode & 48) == 32;
        Boolean bool = ee3.b;
        bg4 bg4 = ee3.a;
        if (bool == null) {
            ee3.b = Boolean.valueOf(z);
            ee3.c = Float.valueOf(configuration.fontScale);
            ((tme) ((je7) bg4.Y).getValue()).b(true);
            return;
        }
        if (bool.booleanValue() != z) {
            hm9.m("ee3", "onConfigurationChanged: system night mode changed to " + z, new Object[0]);
            ee3.b = Boolean.valueOf(z);
            ((tme) ((je7) bg4.Y).getValue()).b(true);
        }
        if (ee3.c.floatValue() != configuration.fontScale) {
            hm9.m("ee3", "onConfigurationChanged: fontScale changed from " + ee3.c + " to " + configuration.fontScale, new Object[0]);
            ee3.c = Float.valueOf(configuration.fontScale);
            Context context = (Context) ((v4) bg4.b).c(Context.class);
            bk4.b().c();
            ((t6b) ((je7) bg4.c).getValue()).a();
            ((el3) ((je7) bg4.o).getValue()).e();
            ((p82) ((je7) bg4.X).getValue()).s();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x01e7, code lost:
        if (r2 < r7[2]) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x01eb, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x01f7, code lost:
        if (r2 < r7[1]) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x01fe, code lost:
        if (r2 < r7[0]) goto L_0x01e9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
            r18 = this;
            r0 = r18
            r3 = 7
            r4 = 6
            r5 = 17
            r6 = 16
            r7 = 12
            r8 = 9
            r9 = 3
            r10 = 2
            r11 = 13
            r12 = 5
            r13 = 1
            java.lang.String r14 = r0.Y
            java.lang.String r15 = "onCreate"
            defpackage.hm9.m(r14, r15, new java.lang.Object[0])
            super.onCreate()
            boolean r14 = com.jakewharton.processphoenix.ProcessPhoenix.a(r18)
            if (r14 == 0) goto L_0x0023
            return
        L_0x0023:
            ly5 r14 = r18.c()
            p4a r15 = new p4a
            r15.<init>(r0, r12)
            nz4 r1 = defpackage.nz4.a
            java.lang.String r2 = "DevicePerformanceClass"
            r0.b(r14, r2, r1, r15)
            ly5 r2 = r18.c()
            q4a r14 = new q4a
            r14.<init>(r8)
            java.lang.String r15 = "ServerPayloadCatchMode"
            iy5 r2 = r0.b(r2, r15, r1, r14)
            ly5 r14 = r18.c()
            q4a r15 = new q4a
            r15.<init>(r7)
            java.lang.String r7 = "Connect"
            r0.b(r14, r7, r1, r15)
            ly5 r7 = r18.c()
            java.util.List r2 = java.util.Collections.singletonList(r2)
            p4a r14 = new p4a
            r14.<init>(r0, r11)
            java.lang.String r15 = "LocaleHelper"
            iy5 r2 = r0.b(r7, r15, r2, r14)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            ly5 r7 = r18.c()
            q4a r14 = new q4a
            r14.<init>(r11)
            java.lang.String r15 = "Legacy.Stickers"
            r0.b(r7, r15, r2, r14)
            ly5 r7 = r18.c()
            q4a r14 = new q4a
            r15 = 14
            r14.<init>(r15)
            java.lang.String r15 = "ForceUpdateLogic.clearForceUpdateVersionIfNeed"
            r0.b(r7, r15, r2, r14)
            ly5 r7 = r18.c()
            q4a r14 = new q4a
            r15 = 15
            r14.<init>(r15)
            java.lang.String r15 = "ServiceTaskCheckProcessingTasks"
            r0.b(r7, r15, r2, r14)
            ly5 r7 = r18.c()
            q4a r14 = new q4a
            r14.<init>(r6)
            java.lang.String r15 = "Legacy.ContactsLoader"
            r0.b(r7, r15, r2, r14)
            ly5 r7 = r18.c()
            q4a r14 = new q4a
            r14.<init>(r5)
            java.lang.String r15 = "Legacy.CallsHistoryLoader"
            r0.b(r7, r15, r2, r14)
            ly5 r7 = r18.c()
            q4a r14 = new q4a
            r15 = 18
            r14.<init>(r15)
            java.lang.String r15 = "Legacy.MessageControllerConsumer"
            r0.b(r7, r15, r2, r14)
            ly5 r7 = r18.c()
            p4a r14 = new p4a
            r14.<init>(r0, r4)
            java.lang.String r15 = "Legacy.ActivityLifecycleCallbacks"
            r0.b(r7, r15, r2, r14)
            ly5 r7 = r18.c()
            q4a r14 = new q4a
            r14.<init>(r13)
            java.lang.String r15 = "RestoreMessageUploads"
            r0.b(r7, r15, r2, r14)
            ly5 r7 = r18.c()
            q4a r14 = new q4a
            r14.<init>(r10)
            java.lang.String r15 = "Legacy.Drafts"
            r0.b(r7, r15, r2, r14)
            ly5 r7 = r18.c()
            q4a r14 = new q4a
            r14.<init>(r9)
            java.lang.String r15 = "Legacy.Phonebook"
            r0.b(r7, r15, r2, r14)
            ly5 r7 = r18.c()
            q4a r14 = new q4a
            r15 = 4
            r14.<init>(r15)
            java.lang.String r15 = "Legacy.SystemServicesManager"
            r0.b(r7, r15, r1, r14)
            ly5 r7 = r18.c()
            q4a r14 = new q4a
            r14.<init>(r12)
            java.lang.String r15 = "Legacy.ShortcutsHelper"
            r0.b(r7, r15, r2, r14)
            ly5 r7 = r18.c()
            p4a r14 = new p4a
            r14.<init>(r0, r3)
            java.lang.String r15 = "Legacy.Permissions"
            r0.b(r7, r15, r1, r14)
            ly5 r7 = r18.c()
            p4a r14 = new p4a
            r15 = 8
            r14.<init>(r0, r15)
            java.lang.String r15 = "PermissionStats"
            r0.b(r7, r15, r1, r14)
            ly5 r7 = r18.c()
            q4a r14 = new q4a
            r14.<init>(r4)
            java.lang.String r4 = "Legacy.PhoneNumberUtil"
            r0.b(r7, r4, r2, r14)
            ly5 r4 = r18.c()
            q4a r7 = new q4a
            r7.<init>(r3)
            java.lang.String r3 = "Legacy.CallLinksLoader"
            r0.b(r4, r3, r2, r7)
            ly5 r3 = r18.c()
            p4a r4 = new p4a
            r4.<init>(r0, r8)
            java.lang.String r7 = "Legacy.StartupListeners"
            r0.b(r3, r7, r2, r4)
            ly5 r2 = r18.c()
            q4a r3 = new q4a
            r4 = 10
            r3.<init>(r4)
            java.lang.String r7 = "Shortcuts and badge warmup"
            r0.b(r2, r7, r1, r3)
            ly5 r2 = r18.c()
            p4a r3 = new p4a
            r3.<init>(r0, r4)
            java.lang.String r4 = "InAppReviewUncaughtExceptionHandler"
            r0.b(r2, r4, r1, r3)
            ly5 r2 = r18.c()
            q4a r3 = new q4a
            r4 = 11
            r3.<init>(r4)
            java.lang.String r7 = "HeartbeatScheduler"
            r0.b(r2, r7, r1, r3)
            ly5 r2 = r18.c()
            p4a r3 = new p4a
            r3.<init>(r0, r4)
            java.lang.String r4 = "Db.NotMainThreadListener"
            r0.b(r2, r4, r1, r3)
            ly5 r2 = r18.c()
            p4a r3 = new p4a
            r4 = 12
            r3.<init>(r0, r4)
            java.lang.String r4 = "Mytracker"
            r0.b(r2, r4, r1, r3)
            ly5 r2 = r18.c()
            r2.getClass()
            java.util.ArrayList r3 = r2.c     // Catch:{ all -> 0x0400 }
            java.util.concurrent.ForkJoinTask.invokeAll(r3)     // Catch:{ all -> 0x0400 }
            java.util.ArrayList r2 = r2.c
            r2.clear()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r7 = r0.X
            long r2 = r2 - r7
            gta r4 = defpackage.tfg.s(r18)
            y8a r7 = defpackage.y8a.a
            p7b r7 = r7.n()
            z7d r7 = r7.b
            r7.getClass()
            long[] r7 = defpackage.y7d.c
            int r8 = r7.length
            if (r8 != r9) goto L_0x03f4
            vi4 r4 = r4.a
            int r4 = r4.ordinal()
            r8 = 0
            if (r4 == 0) goto L_0x01fa
            if (r4 == r13) goto L_0x01f3
            if (r4 != r10) goto L_0x01ed
            r14 = r7[r10]
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x01eb
        L_0x01e9:
            r4 = r13
            goto L_0x0201
        L_0x01eb:
            r4 = r8
            goto L_0x0201
        L_0x01ed:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01f3:
            r14 = r7[r13]
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x01eb
            goto L_0x01e9
        L_0x01fa:
            r14 = r7[r8]
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x01eb
            goto L_0x01e9
        L_0x0201:
            r4 = r4 ^ r13
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r2)
            java.lang.String r15 = "ms from start!\n"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r7.append(r14)
            java.lang.String r14 = "Total tasks durations: "
            r7.append(r14)
            ly5 r14 = r18.c()
            ky5 r14 = r14.b
            java.lang.Object r14 = r14.b
            java.util.concurrent.ConcurrentSkipListSet r14 = (java.util.concurrent.ConcurrentSkipListSet) r14
            java.util.Iterator r14 = r14.iterator()
            r15 = 0
            r5 = r15
        L_0x0231:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x024d
            java.lang.Object r15 = r14.next()
            l38 r15 = (defpackage.l38) r15
            java.util.concurrent.TimeUnit r8 = r15.o
            r17 = r14
            long r13 = r15.c
            long r13 = r8.toMillis(r13)
            long r5 = r5 + r13
            r14 = r17
            r8 = 0
            r13 = 1
            goto L_0x0231
        L_0x024d:
            r7.append(r5)
            java.lang.String r5 = "ms \nTopmost by durations:\n"
            r7.append(r5)
            ly5 r5 = r18.c()
            ky5 r5 = r5.b
            java.util.Comparator r6 = java.util.Comparator.reverseOrder()
            java.util.TreeSet r8 = new java.util.TreeSet
            r8.<init>(r6)
            defpackage.x53.A0(r5, r8)
            ww9 r5 = new ww9
            r5.<init>(r10)
            r6 = 44
            defpackage.x53.m0(r8, r7, r12, r5, r6)
            java.lang.String r5 = "\nTopmost by waiting:\n"
            r7.append(r5)
            ly5 r5 = r18.c()
            ky5 r5 = r5.b
            d5a r8 = defpackage.d5a.a
            lz6 r8 = new lz6
            r10 = 1
            r8.<init>(r10)
            java.util.Comparator r8 = java.util.Comparator.comparingLong(r8)
            java.util.Comparator r8 = r8.reversed()
            java.util.TreeSet r10 = new java.util.TreeSet
            r10.<init>(r8)
            defpackage.x53.A0(r5, r10)
            ww9 r5 = new ww9
            r5.<init>(r9)
            defpackage.x53.m0(r10, r7, r12, r5, r6)
            java.lang.String r5 = "\nThreads info:\n"
            r7.append(r5)
            ly5 r5 = r18.c()
            ky5 r5 = r5.b
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.lang.Object r5 = r5.b
            java.util.concurrent.ConcurrentSkipListSet r5 = (java.util.concurrent.ConcurrentSkipListSet) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x02b4:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x02d7
            java.lang.Object r8 = r5.next()
            r9 = r8
            l38 r9 = (defpackage.l38) r9
            java.lang.String r9 = r9.X
            java.lang.Object r10 = r6.get(r9)
            if (r10 != 0) goto L_0x02d1
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r6.put(r9, r10)
        L_0x02d1:
            java.util.List r10 = (java.util.List) r10
            r10.add(r8)
            goto L_0x02b4
        L_0x02d7:
            bk r5 = new bk
            r5.<init>(r11, r7)
            a29 r8 = new a29
            r9 = 1
            r8.<init>(r5, r9)
            r6.forEach(r8)
            java.lang.String r5 = r7.toString()
            java.lang.String r6 = r0.Y
            defpackage.hm9.m(r6, r5, new java.lang.Object[0])
            bcf r6 = defpackage.bcf.a
            ty3 r7 = r6.c()
            qq9 r8 = defpackage.us7.c
            np r7 = (defpackage.np) r7
            r7.getClass()
            khe r7 = defpackage.np.e
            java.lang.Object r7 = r7.getValue()
            pye r7 = (defpackage.pye) r7
            if (r7 == 0) goto L_0x0308
            defpackage.pye.a(r5)
        L_0x0308:
            if (r4 == 0) goto L_0x034c
            ty3 r4 = r6.c()
            gta r5 = defpackage.tfg.s(r18)
            y8a r6 = defpackage.y8a.a
            v4 r6 = r6.getAccessor()
            java.lang.Class<f5a> r7 = defpackage.f5a.class
            java.lang.Object r6 = r6.c(r7)
            f5a r6 = (defpackage.f5a) r6
            boolean r6 = r6.d()
            one.me.android.perfomance.ApplicationCreationOvertimeException r7 = new one.me.android.perfomance.ApplicationCreationOvertimeException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "isLoggedIn="
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r6 = " creationTime="
            r8.append(r6)
            r8.append(r2)
            java.lang.String r6 = " perfClass="
            r8.append(r6)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5)
            java.lang.String r5 = "ONEME-1862"
            r4.a(r5, r7)
        L_0x034c:
            r4 = 0
            kpa[] r5 = new defpackage.kpa[r4]
            java.lang.String r4 = "app_creation_duration"
            eze r6 = defpackage.eze.a     // Catch:{ all -> 0x0365 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0365 }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0365 }
            long r2 = r7.toNanos(r2)     // Catch:{ all -> 0x0365 }
            r7 = 0
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r7)     // Catch:{ all -> 0x0365 }
            kpa[] r5 = (defpackage.kpa[]) r5     // Catch:{ all -> 0x0365 }
            defpackage.eze.a(r4, r2, r6, r5)     // Catch:{ all -> 0x0365 }
        L_0x0365:
            ly5 r2 = r18.c()
            q4a r3 = new q4a
            r4 = 21
            r3.<init>(r4)
            java.lang.String r4 = "GalleryPrefetch"
            defpackage.iy5 unused = r2.a(r4, defpackage.nz4.a, r3)
            p4a r3 = new p4a
            r4 = 16
            r3.<init>(r0, r4)
            java.lang.String r4 = "Legacy.TimeChangeReceiver"
            r2.a(r4, r1, r3)
            q4a r3 = new q4a
            r4 = 22
            r3.<init>(r4)
            java.lang.String r4 = "Legacy.Theme.ScheduleNightModeCheckIfNeed"
            r2.a(r4, r1, r3)
            p4a r3 = new p4a
            r4 = 17
            r3.<init>(r0, r4)
            java.lang.String r4 = "Legacy.SendInstallInfo"
            r2.a(r4, r1, r3)
            q4a r3 = new q4a
            r4 = 23
            r3.<init>(r4)
            java.lang.String r4 = "Legacy.DailyAnalytics"
            r2.a(r4, r1, r3)
            q4a r3 = new q4a
            r4 = 24
            r3.<init>(r4)
            java.lang.String r4 = "NotificationTrackerCleanupScheduler"
            r2.a(r4, r1, r3)
            q4a r3 = new q4a
            r4 = 25
            r3.<init>(r4)
            java.lang.String r4 = "Stickers warmup"
            r2.a(r4, r1, r3)
            q4a r3 = new q4a
            r4 = 26
            r3.<init>(r4)
            java.lang.String r4 = "QrCodeGenerator"
            r2.a(r4, r1, r3)
            yo r0 = r0.b
            r0.getClass()
            cta r0 = defpackage.cta.APP_INIT
            qi9 r1 = defpackage.yo.b
            java.lang.Object r2 = r1.f(r0)
            bta r2 = (defpackage.bta) r2
            if (r2 == 0) goto L_0x03f3
            long r2 = r2.e
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x03f3
            java.lang.Object r0 = r1.f(r0)
            bta r0 = (defpackage.bta) r0
            if (r0 == 0) goto L_0x03f3
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r0.b
            long r1 = r1 - r3
            r0.e = r1
        L_0x03f3:
            return
        L_0x03f4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0400:
            r0 = move-exception
            java.util.ArrayList r1 = r2.c     // Catch:{ all -> 0x041d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x041d }
            r3 = r0
        L_0x0408:
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x041d }
            if (r4 == 0) goto L_0x0433
            java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x041d }
            jy5 r4 = (defpackage.jy5) r4     // Catch:{ all -> 0x041d }
            java.lang.Throwable r5 = r4.o     // Catch:{ all -> 0x041d }
            if (r5 == 0) goto L_0x041f
            java.lang.Class r6 = r5.getClass()     // Catch:{ all -> 0x041d }
            goto L_0x0420
        L_0x041d:
            r0 = move-exception
            goto L_0x0434
        L_0x041f:
            r6 = 0
        L_0x0420:
            java.lang.Class r7 = r0.getClass()     // Catch:{ all -> 0x041d }
            boolean r6 = defpackage.tpa.f(r6, r7)     // Catch:{ all -> 0x041d }
            if (r6 == 0) goto L_0x042b
            r3 = r5
        L_0x042b:
            r5 = 1
            r4.cancel(r5)     // Catch:{ all -> 0x041d }
            r4.completeExceptionally(r0)     // Catch:{ all -> 0x041d }
            goto L_0x0408
        L_0x0433:
            throw r3     // Catch:{ all -> 0x041d }
        L_0x0434:
            java.util.ArrayList r1 = r2.c
            r1.clear()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.android.OneMeApplication.onCreate():void");
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        if (i >= 40 && !ProcessPhoenix.a(this)) {
            hm9.m(this.Y, "onTrimMemory: TRIM_MEMORY_BACKGROUND", new Object[0]);
            iu6 iu6 = (iu6) y8a.a.getAccessor().c(iu6.class);
            ((iba) iu6.d.getValue()).a().execute(new nn6(3, iu6));
            LruCache lruCache = mre.a;
            hm9.m("ThemeBackgroundCache", "clear cache of themes.", new Object[0]);
            mre.a.evictAll();
        }
    }
}
