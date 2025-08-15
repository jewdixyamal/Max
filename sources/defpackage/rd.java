package defpackage;

import android.graphics.Matrix;
import android.media.Image;

/* renamed from: rd  reason: default package */
public final class rd implements ov6 {
    public final Image a;
    public final sy4[] b;
    public final ra0 c;

    public rd(Image image) {
        this.a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new sy4[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new sy4(2, (Object) planes[i]);
            }
        } else {
            this.b = new sy4[0];
        }
        this.c = new ra0(nje.b, image.getTimestamp(), 0, new Matrix());
    }

    public final Image Z() {
        return this.a;
    }

    public final void close() {
        this.a.close();
    }

    public final int getHeight() {
        return this.a.getHeight();
    }

    public final su6 getImageInfo() {
        return this.c;
    }

    public final int getWidth() {
        return this.a.getWidth();
    }

    public final int k0() {
        return this.a.getFormat();
    }

    public final sy4[] v() {
        return this.b;
    }
}
