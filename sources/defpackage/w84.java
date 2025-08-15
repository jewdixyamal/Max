package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* renamed from: w84  reason: default package */
public final class w84 extends ei0 implements CloseableStaticBitmap {
    public static final /* synthetic */ int t0 = 0;
    public volatile Bitmap X;
    public final pqb Y;
    public final int Z;
    public o43 o;
    public final int s0;

    public w84(Bitmap bitmap, pic pic, pqb pqb, int i, int i2) {
        bitmap.getClass();
        this.X = bitmap;
        Bitmap bitmap2 = this.X;
        pic.getClass();
        this.o = o43.p0(bitmap2, pic, o43.Y);
        this.Y = pqb;
        this.Z = i;
        this.s0 = i2;
    }

    public final synchronized o43 cloneUnderlyingBitmapReference() {
        return o43.o(this.o);
    }

    public final void close() {
        o43 o43;
        synchronized (this) {
            o43 = this.o;
            this.o = null;
            this.X = null;
        }
        if (o43 != null) {
            o43.close();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized defpackage.o43 convertToBitmapReference() {
        /*
            r2 = this;
            monitor-enter(r2)
            o43 r0 = r2.o     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = "Cannot convert a closed static bitmap"
            defpackage.od2.o(r0, r1)     // Catch:{ all -> 0x0016 }
            monitor-enter(r2)     // Catch:{ all -> 0x0016 }
            o43 r0 = r2.o     // Catch:{ all -> 0x0013 }
            r1 = 0
            r2.o = r1     // Catch:{ all -> 0x0013 }
            r2.X = r1     // Catch:{ all -> 0x0013 }
            monitor-exit(r2)     // Catch:{ all -> 0x0016 }
            monitor-exit(r2)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            throw r0     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0016 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w84.convertToBitmapReference():o43");
    }

    public final void finalize() {
        if (!isClosed()) {
            ta5.m("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", w84.class.getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public final int getExifOrientation() {
        return this.s0;
    }

    public final int getHeight() {
        int i;
        if (this.Z % 180 != 0 || (i = this.s0) == 5 || i == 7) {
            Bitmap bitmap = this.X;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.X;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    public final pqb getQualityInfo() {
        return this.Y;
    }

    public final int getRotationAngle() {
        return this.Z;
    }

    public final int getSizeInBytes() {
        return qo0.d(this.X);
    }

    public final Bitmap getUnderlyingBitmap() {
        return this.X;
    }

    public final int getWidth() {
        int i;
        if (this.Z % 180 != 0 || (i = this.s0) == 5 || i == 7) {
            Bitmap bitmap = this.X;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.X;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    public final synchronized boolean isClosed() {
        return this.o == null;
    }

    public w84(o43 o43, pqb pqb, int i, int i2) {
        o43 n = o43.n();
        n.getClass();
        this.o = n;
        this.X = (Bitmap) n.e0();
        this.Y = pqb;
        this.Z = i;
        this.s0 = i2;
    }
}
