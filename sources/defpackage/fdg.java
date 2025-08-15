package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;

/* renamed from: fdg  reason: default package */
public final class fdg implements wsa {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ aab b;

    public fdg(aab aab, BasePendingResult basePendingResult) {
        this.b = aab;
        this.a = basePendingResult;
    }

    public final void a(Status status) {
        ((Map) this.b.a).remove(this.a);
    }
}
