package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import org.apache.http.protocol.HTTP;

public class IconCompatParcelizer {
    public static IconCompat read(jcf jcf) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.a = jcf.f(iconCompat.a, 1);
        byte[] bArr = iconCompat.c;
        if (jcf.e(2)) {
            Parcel parcel = ((kcf) jcf).e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.c = bArr;
        iconCompat.d = jcf.g(iconCompat.d, 3);
        iconCompat.e = jcf.f(iconCompat.e, 4);
        iconCompat.f = jcf.f(iconCompat.f, 5);
        iconCompat.g = (ColorStateList) jcf.g(iconCompat.g, 6);
        String str = iconCompat.i;
        if (jcf.e(7)) {
            str = ((kcf) jcf).e.readString();
        }
        iconCompat.i = str;
        String str2 = iconCompat.j;
        if (jcf.e(8)) {
            str2 = ((kcf) jcf).e.readString();
        }
        iconCompat.j = str2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.i);
        switch (iconCompat.a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable != null) {
                    iconCompat.b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 == null) {
                    byte[] bArr3 = iconCompat.c;
                    iconCompat.b = bArr3;
                    iconCompat.a = 3;
                    iconCompat.e = 0;
                    iconCompat.f = bArr3.length;
                    break;
                } else {
                    iconCompat.b = parcelable2;
                    break;
                }
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.c, Charset.forName(HTTP.UTF_16));
                iconCompat.b = str3;
                if (iconCompat.a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                    break;
                }
            case 3:
                iconCompat.b = iconCompat.c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, jcf jcf) {
        jcf.getClass();
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.b;
                break;
            case 2:
                iconCompat.c = ((String) iconCompat.b).getBytes(Charset.forName(HTTP.UTF_16));
                break;
            case 3:
                iconCompat.c = (byte[]) iconCompat.b;
                break;
            case 4:
            case 6:
                iconCompat.c = iconCompat.b.toString().getBytes(Charset.forName(HTTP.UTF_16));
                break;
        }
        int i = iconCompat.a;
        if (-1 != i) {
            jcf.j(i, 1);
        }
        byte[] bArr = iconCompat.c;
        if (bArr != null) {
            jcf.i(2);
            int length = bArr.length;
            Parcel parcel = ((kcf) jcf).e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            jcf.k(parcelable, 3);
        }
        int i2 = iconCompat.e;
        if (i2 != 0) {
            jcf.j(i2, 4);
        }
        int i3 = iconCompat.f;
        if (i3 != 0) {
            jcf.j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            jcf.k(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            jcf.i(7);
            ((kcf) jcf).e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            jcf.i(8);
            ((kcf) jcf).e.writeString(str2);
        }
    }
}
