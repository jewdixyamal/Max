package defpackage;

import android.net.Uri;
import android.util.Base64;
import android.util.Size;
import kotlin.coroutines.Continuation;

/* renamed from: djf  reason: default package */
public final class djf extends ffe implements a66 {
    public final /* synthetic */ byte[] X;
    public final /* synthetic */ ejf Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public djf(byte[] bArr, ejf ejf, Continuation continuation) {
        super(2, continuation);
        this.X = bArr;
        this.Y = ejf;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((djf) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new djf(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        String str;
        Object value;
        od2.a0(obj);
        String encodeToString = Base64.encodeToString(this.X, 2);
        StringBuilder sb = new StringBuilder("data:");
        switch (2) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "IMAGE_JPEG";
                break;
            case 3:
                str = "IMAGE_PNG";
                break;
            case 4:
                str = "IMAGE_WEBP";
                break;
            case 5:
                str = "IMAGE_GIF";
                break;
            case 6:
                str = "IMAGE_ANY";
                break;
            case 7:
                str = "IMAGE_HEIC";
                break;
            case 8:
                str = "VIDEO_MP4";
                break;
            case 9:
                str = "VIDEO_ANY";
                break;
            case 10:
                str = "TEXT_PLAIN";
                break;
            case 11:
                str = "TEXT_VCARD";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(";base64,");
        sb.append(encodeToString);
        Uri parse = Uri.parse(sb.toString());
        q0e q0e = this.Y.A0;
        do {
            value = q0e.getValue();
        } while (!q0e.c(value, vif.a((vif) value, (Size) null, (String) null, parse.toString(), 3)));
        return e5f.a;
    }
}
