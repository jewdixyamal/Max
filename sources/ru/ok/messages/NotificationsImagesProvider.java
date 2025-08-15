package ru.ok.messages;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/NotificationsImagesProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class NotificationsImagesProvider extends ContentProvider {
    public static final UriMatcher a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("one.me.android.notifications", "message_image/*/*", 1);
        a = uriMatcher;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(ru.ok.messages.NotificationsImagesProvider r7, defpackage.ww0 r8, defpackage.sx3 r9, kotlin.coroutines.Continuation r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.fw9
            if (r0 == 0) goto L_0x0016
            r0 = r10
            fw9 r0 = (defpackage.fw9) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x001b
        L_0x0016:
            fw9 r0 = new fw9
            r0.<init>(r7, r10)
        L_0x001b:
            java.lang.Object r10 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            sx3 r7 = r0.Y
            ww0 r8 = r0.X
            ru.ok.messages.NotificationsImagesProvider r9 = r0.o
            defpackage.od2.a0(r10)
            r6 = r9
            r9 = r7
            r7 = r6
            goto L_0x003e
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            defpackage.od2.a0(r10)
        L_0x003e:
            boolean r10 = defpackage.j1e.z(r9)
            if (r10 == 0) goto L_0x0066
            r7.getClass()
            java.io.File r10 = b(r8)
            if (r10 == 0) goto L_0x0055
            boolean r2 = r10.exists()
            if (r2 == 0) goto L_0x0055
            r1 = r10
            goto L_0x0067
        L_0x0055:
            r0.o = r7
            r0.X = r8
            r0.Y = r9
            r0.t0 = r3
            r4 = 100
            java.lang.Object r10 = defpackage.j47.x(r4, r0)
            if (r10 != r1) goto L_0x003e
            goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.NotificationsImagesProvider.a(ru.ok.messages.NotificationsImagesProvider, ww0, sx3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static File b(ww0 ww0) {
        kg5 c = ((el4) ((lg5) ((bl4) lv6.g().d.get()).a.getValue())).c(ww0);
        if (!(c instanceof kg5)) {
            c = null;
        }
        if (c != null) {
            return c.a;
        }
        return null;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String[] getStreamTypes(Uri uri, String str) {
        if (eae.o0(str, "*/", false) || eae.o0(str, "image/", false)) {
            return new String[]{"image/jpeg", "image/png", "image/webp"};
        }
        return null;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r7v11, types: [njc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "r"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x00fb
            android.content.UriMatcher r8 = a
            int r8 = r8.match(r7)
            r0 = 1
            if (r8 != r0) goto L_0x00f3
            java.util.List r8 = r7.getPathSegments()
            if (r8 == 0) goto L_0x00f3
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x00f3
            java.util.List r8 = r7.getPathSegments()
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            if (r0 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            java.lang.String r2 = "Failed"
            if (r0 == 0) goto L_0x00ed
            int r3 = r0.length()
            if (r3 == 0) goto L_0x00ed
            r3 = 2
            java.lang.Object r8 = r8.get(r3)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x00e7
            boolean r8 = java.lang.Boolean.parseBoolean(r8)
            android.net.Uri r0 = defpackage.j47.N(r0)
            android.content.Context r3 = r6.getContext()
            ed3 r4 = defpackage.vl.b()
            y8a r4 = (defpackage.y8a) r4
            o45 r4 = r4.g()
            boolean r3 = defpackage.tfg.x(r0, r3, r4)
            java.lang.String r4 = "ru.ok.messages.NotificationsImagesProvider"
            if (r3 != 0) goto L_0x00ce
            xv6 r7 = defpackage.xv6.d(r0)
            vv6 r3 = defpackage.vv6.DISK_CACHE
            r7.b = r3
            wv6 r7 = r7.a()
            o84 r3 = defpackage.o84.g()
            r3.getClass()
            android.net.Uri r7 = r7.b
            tpd r7 = r3.d(r7)
            java.io.File r3 = b(r7)
            boolean r5 = defpackage.pag.k(r3)
            if (r5 != 0) goto L_0x00ae
            if (r8 == 0) goto L_0x00ae
            hw9 r3 = new hw9     // Catch:{ all -> 0x0090 }
            r3.<init>(r6, r0, r7, r1)     // Catch:{ all -> 0x0090 }
            hz4 r6 = defpackage.hz4.a     // Catch:{ all -> 0x0090 }
            java.lang.Object r6 = defpackage.j47.f0(r6, r3)     // Catch:{ all -> 0x0090 }
            java.io.File r6 = (java.io.File) r6     // Catch:{ all -> 0x0090 }
            goto L_0x0097
        L_0x0090:
            r6 = move-exception
            njc r7 = new njc
            r7.<init>(r6)
            r6 = r7
        L_0x0097:
            java.lang.Throwable r7 = defpackage.pjc.a(r6)
            if (r7 != 0) goto L_0x00a1
            r3 = r6
            java.io.File r3 = (java.io.File) r3
            goto L_0x00ae
        L_0x00a1:
            java.lang.String r6 = "fetchUriOnDiskSync: failed"
            defpackage.hm9.p(r4, r6, r7)
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r7 = "Download failed"
            r6.<init>(r7)
            throw r6
        L_0x00ae:
            if (r3 == 0) goto L_0x00b7
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r6 = android.os.ParcelFileDescriptor.open(r3, r6)
            return r6
        L_0x00b7:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "openFile: no image in cache, loadFromNetwork="
            r6.<init>(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            defpackage.hm9.m(r4, r6, new java.lang.Object[0])
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            r6.<init>(r2)
            throw r6
        L_0x00ce:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "openFile: failed, internal uri="
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            defpackage.hm9.p(r4, r6, r1)
            java.lang.SecurityException r6 = new java.lang.SecurityException
            java.lang.String r7 = "Internal uri detected"
            r6.<init>(r7)
            throw r6
        L_0x00e7:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            r6.<init>(r2)
            throw r6
        L_0x00ed:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            r6.<init>(r2)
            throw r6
        L_0x00f3:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r7 = "Wrong uri"
            r6.<init>(r7)
            throw r6
        L_0x00fb:
            java.lang.SecurityException r6 = new java.lang.SecurityException
            java.lang.String r7 = "Only read mode is supported"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.NotificationsImagesProvider.openFile(android.net.Uri, java.lang.String):android.os.ParcelFileDescriptor");
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
