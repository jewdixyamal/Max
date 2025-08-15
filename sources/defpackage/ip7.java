package defpackage;

import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: ip7  reason: default package */
public final class ip7 extends w0e {
    public final /* synthetic */ int Y = 2;
    public final /* synthetic */ hab Z;
    public final /* synthetic */ eab s0;
    public final /* synthetic */ Object t0;
    public final /* synthetic */ dab u0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ip7(fi0 fi0, hab hab, eab eab, sse sse) {
        super(fi0, hab, eab, "BackgroundThreadHandoffProducer");
        this.t0 = fi0;
        this.Z = hab;
        this.s0 = eab;
        this.u0 = sse;
    }

    private final void h(Object obj) {
    }

    public final void b(Object obj) {
        switch (this.Y) {
            case 0:
                g05.d((g05) obj);
                return;
            case 1:
                o43.S((o43) obj);
                return;
            default:
                return;
        }
    }

    public Map c(Object obj) {
        switch (this.Y) {
            case 1:
                return dx6.a("createdThumbnail", String.valueOf(((o43) obj) != null));
            default:
                return super.c(obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x006c A[SYNTHETIC, Splitter:B:38:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0072 A[SYNTHETIC, Splitter:B:44:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d() {
        /*
            r8 = this;
            int r0 = r8.Y
            switch(r0) {
                case 0: goto L_0x0099;
                case 1: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            r8 = 0
            return r8
        L_0x0007:
            dab r0 = r8.u0
            tq7 r0 = (defpackage.tq7) r0
            java.lang.Object r1 = r8.t0
            wv6 r1 = (defpackage.wv6) r1
            r2 = 0
            r0.getClass()     // Catch:{ IllegalArgumentException -> 0x001c }
            android.net.Uri r3 = r1.b     // Catch:{ IllegalArgumentException -> 0x001c }
            android.content.ContentResolver r4 = r0.c     // Catch:{ IllegalArgumentException -> 0x001c }
            java.lang.String r3 = defpackage.e9f.a(r4, r3)     // Catch:{ IllegalArgumentException -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r3 = r2
        L_0x001d:
            if (r3 == 0) goto L_0x003c
            jic r4 = r1.i
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x0028
            int r6 = r4.a
            goto L_0x0029
        L_0x0028:
            r6 = r5
        L_0x0029:
            r7 = 96
            if (r6 > r7) goto L_0x0036
            if (r4 == 0) goto L_0x0031
            int r5 = r4.b
        L_0x0031:
            if (r5 <= r7) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r4 = 3
            goto L_0x0037
        L_0x0036:
            r4 = 1
        L_0x0037:
            android.graphics.Bitmap r3 = android.media.ThumbnailUtils.createVideoThumbnail(r3, r4)
            goto L_0x003d
        L_0x003c:
            r3 = r2
        L_0x003d:
            if (r3 != 0) goto L_0x0076
            android.content.ContentResolver r0 = r0.c
            android.net.Uri r1 = r1.b
            java.lang.String r3 = "r"
            android.os.ParcelFileDescriptor r0 = r0.openFileDescriptor(r1, r3)     // Catch:{ FileNotFoundException -> 0x0068, all -> 0x0066 }
            r0.getClass()     // Catch:{ FileNotFoundException -> 0x0068, all -> 0x0066 }
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch:{ FileNotFoundException -> 0x0068, all -> 0x0066 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0068, all -> 0x0066 }
            java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x0070, all -> 0x0063 }
            r1.setDataSource(r0)     // Catch:{ FileNotFoundException -> 0x0070, all -> 0x0063 }
            r3 = -1
            android.graphics.Bitmap r0 = r1.getFrameAtTime(r3)     // Catch:{ FileNotFoundException -> 0x0070, all -> 0x0063 }
            r1.release()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            r3 = r0
            goto L_0x0076
        L_0x0063:
            r8 = move-exception
            r2 = r1
            goto L_0x006a
        L_0x0066:
            r8 = move-exception
            goto L_0x006a
        L_0x0068:
            r1 = r2
            goto L_0x0070
        L_0x006a:
            if (r2 == 0) goto L_0x006f
            r2.release()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            throw r8
        L_0x0070:
            if (r1 == 0) goto L_0x0075
            r1.release()     // Catch:{ IOException -> 0x0075 }
        L_0x0075:
            r3 = r2
        L_0x0076:
            if (r3 != 0) goto L_0x0079
            goto L_0x0098
        L_0x0079:
            pq9 r0 = defpackage.pq9.q()
            hx6 r1 = defpackage.hx6.d
            r2 = 0
            com.facebook.imagepipeline.image.CloseableStaticBitmap r0 = com.facebook.imagepipeline.image.CloseableStaticBitmap.of((android.graphics.Bitmap) r3, (defpackage.pic) r0, (defpackage.pqb) r1, (int) r2)
            eab r8 = r8.s0
            oj0 r8 = (defpackage.oj0) r8
            java.lang.String r1 = "image_format"
            java.lang.String r2 = "thumbnail"
            r8.putExtra(r1, r2)
            java.util.HashMap r8 = r8.Y
            r0.putExtras(r8)
            v84 r2 = defpackage.o43.o0(r0)
        L_0x0098:
            return r2
        L_0x0099:
            java.lang.Object r0 = r8.t0
            wv6 r0 = (defpackage.wv6) r0
            dab r1 = r8.u0
            jp7 r1 = (defpackage.jp7) r1
            g05 r0 = r1.d(r0)
            java.lang.String r2 = "fetch"
            java.lang.String r3 = "local"
            hab r4 = r8.Z
            eab r8 = r8.s0
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = r1.e()
            r1 = 0
            r4.e(r8, r0, r1)
            oj0 r8 = (defpackage.oj0) r8
            r8.h(r3, r2)
            r0 = 0
            goto L_0x00d8
        L_0x00be:
            r0.S()
            java.lang.String r1 = r1.e()
            r5 = 1
            r4.e(r8, r1, r5)
            oj0 r8 = (defpackage.oj0) r8
            r8.h(r3, r2)
            r0.o0()
            android.graphics.ColorSpace r1 = r0.u0
            java.lang.String r2 = "image_color_space"
            r8.putExtra(r2, r1)
        L_0x00d8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ip7.d():java.lang.Object");
    }

    public void f(Exception exc) {
        switch (this.Y) {
            case 1:
                super.f(exc);
                hab hab = this.Z;
                eab eab = this.s0;
                hab.e(eab, "VideoThumbnailProducer", false);
                ((oj0) eab).h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                return;
            default:
                super.f(exc);
                return;
        }
    }

    public void g(Object obj) {
        switch (this.Y) {
            case 1:
                o43 o43 = (o43) obj;
                super.g(o43);
                boolean z = o43 != null;
                hab hab = this.Z;
                eab eab = this.s0;
                hab.e(eab, "VideoThumbnailProducer", z);
                ((oj0) eab).h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                return;
            case 2:
                hab hab2 = this.Z;
                eab eab2 = this.s0;
                hab2.a(eab2, "BackgroundThreadHandoffProducer", (Map) null);
                ((sse) this.u0).b.a((fi0) this.t0, eab2);
                return;
            default:
                super.g(obj);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ip7(jp7 jp7, fi0 fi0, hab hab, eab eab, String str, wv6 wv6, hab hab2, eab eab2) {
        super(fi0, hab, eab, str);
        this.u0 = jp7;
        this.t0 = wv6;
        this.Z = hab2;
        this.s0 = eab2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ip7(tq7 tq7, fi0 fi0, hab hab, eab eab, hab hab2, eab eab2, wv6 wv6) {
        super(fi0, hab, eab, "VideoThumbnailProducer");
        this.u0 = tq7;
        this.Z = hab2;
        this.s0 = eab2;
        this.t0 = wv6;
    }
}
