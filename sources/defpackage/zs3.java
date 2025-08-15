package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: zs3  reason: default package */
public final class zs3 implements ys3, at3 {
    public Uri X;
    public Bundle Y;
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int o;

    public /* synthetic */ zs3() {
    }

    public void b(Uri uri) {
        this.X = uri;
    }

    public bt3 build() {
        return new bt3(new zs3(this));
    }

    public ClipData c() {
        return this.b;
    }

    public void d(ClipData clipData) {
        this.b = clipData;
    }

    public Uri g() {
        return this.X;
    }

    public Bundle getExtras() {
        return this.Y;
    }

    public int getFlags() {
        return this.o;
    }

    public ContentInfo p() {
        return null;
    }

    public int r() {
        return this.c;
    }

    public void setExtras(Bundle bundle) {
        this.Y = bundle;
    }

    public void setFlags(int i) {
        this.o = i;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.o;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                String str2 = "";
                Uri uri = this.X;
                if (uri == null) {
                    str = str2;
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                if (this.Y != null) {
                    str2 = ", hasExtras";
                }
                return zr6.l(sb, str2, "}");
            default:
                return super.toString();
        }
    }

    public zs3(zs3 zs3) {
        ClipData clipData = zs3.b;
        clipData.getClass();
        this.b = clipData;
        int i = zs3.c;
        c54.l(i, "source", 0, 5);
        this.c = i;
        int i2 = zs3.o;
        if ((i2 & 1) == i2) {
            this.o = i2;
            this.X = zs3.X;
            this.Y = zs3.Y;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }
}
