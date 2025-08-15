package defpackage;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* renamed from: fff  reason: default package */
public final class fff implements dff {
    public final dff a;
    public final Range b;
    public final Range c;
    public final HashSet o;

    public fff(dff dff) {
        HashSet hashSet = new HashSet();
        this.o = hashSet;
        this.a = dff;
        int a1 = dff.a1();
        this.b = Range.create(Integer.valueOf(a1), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) a1))) * a1));
        int w1 = dff.w1();
        this.c = Range.create(Integer.valueOf(w1), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) w1))) * w1));
        List list = MediaCodecInfoReportIncorrectInfoQuirk.a;
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.emptySet());
    }

    public static dff a(dff dff, Size size) {
        if (!(dff instanceof fff)) {
            if (xi4.a.e(MediaCodecInfoReportIncorrectInfoQuirk.class) == null) {
                if (size != null && !dff.Q0(size.getWidth(), size.getHeight())) {
                    Range x1 = dff.x1();
                    Range E1 = dff.E1();
                    size.toString();
                    Objects.toString(x1);
                    Objects.toString(E1);
                }
            }
            dff = new fff(dff);
        }
        if (size != null && (dff instanceof fff)) {
            ((fff) dff).o.add(size);
        }
        return dff;
    }

    public final boolean A1(int i, int i2) {
        dff dff = this.a;
        if (dff.A1(i, i2)) {
            return true;
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getWidth() == i && size.getHeight() == i2) {
                return true;
            }
        }
        if (this.b.contains(Integer.valueOf(i))) {
            return this.c.contains(Integer.valueOf(i2)) && i % dff.a1() == 0 && i2 % dff.w1() == 0;
        }
    }

    public final Range E1() {
        return this.c;
    }

    public final int a1() {
        return this.a.a1();
    }

    public final Range b1() {
        return this.a.b1();
    }

    public final boolean h1() {
        return this.a.h1();
    }

    public final Range r1(int i) {
        Integer valueOf = Integer.valueOf(i);
        Range range = this.c;
        boolean contains = range.contains(valueOf);
        dff dff = this.a;
        boolean z = contains && i % dff.w1() == 0;
        c54.j("Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + dff.w1(), z);
        return this.b;
    }

    public final Range v1(int i) {
        Integer valueOf = Integer.valueOf(i);
        Range range = this.b;
        boolean contains = range.contains(valueOf);
        dff dff = this.a;
        boolean z = contains && i % dff.a1() == 0;
        c54.j("Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + dff.a1(), z);
        return this.c;
    }

    public final int w1() {
        return this.a.w1();
    }

    public final Range x1() {
        return this.b;
    }
}
