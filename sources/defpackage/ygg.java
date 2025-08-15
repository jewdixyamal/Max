package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: ygg  reason: default package */
public final class ygg extends idg {
    public final /* synthetic */ Object d;
    public final /* synthetic */ qne e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ygg(Boolean bool, qne qne) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
        this.d = bool;
        this.e = qne;
    }

    public final boolean G0(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        rdg.b(parcel);
        mqd.G((Status) rdg.a(parcel, Status.CREATOR), this.d, this.e);
        return true;
    }
}
