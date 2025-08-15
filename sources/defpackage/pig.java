package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: pig  reason: default package */
public abstract class pig extends idg implements dfg {
    public final int d;

    public pig(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 4);
        if (bArr.length == 25) {
            this.d = Arrays.hashCode(bArr);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static byte[] K0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean H0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            oy9 oy9 = new oy9(L0());
            parcel2.writeNoException();
            kgg.c(parcel2, oy9);
        } else if (i != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(this.d);
        }
        return true;
    }

    public abstract byte[] L0();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof dfg)) {
            try {
                dfg dfg = (dfg) obj;
                if (((pig) dfg).d != this.d) {
                    return false;
                }
                return Arrays.equals(L0(), (byte[]) oy9.L0(new oy9(((pig) dfg).L0())));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }
}
