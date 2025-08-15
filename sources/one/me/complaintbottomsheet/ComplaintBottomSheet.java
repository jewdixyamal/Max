package one.me.complaintbottomsheet;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/complaintbottomsheet/ComplaintBottomSheet;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "complaint-bottomsheet_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ComplaintBottomSheet extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] X;
    public final fs a;
    public final je7 b;
    public final khe c;
    public final khe o;

    static {
        hob hob = new hob(ComplaintBottomSheet.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        nec.a.getClass();
        X = new bc7[]{hob};
    }

    public ComplaintBottomSheet() {
        this((Bundle) null, 1, (z84) null);
    }

    public final void h(int i, Bundle bundle) {
        oa3 oa3 = (oa3) this.b.getValue();
        oa3.getClass();
        da3[] values = da3.values();
        da3 da3 = (i < 0 || i > values.length + -1) ? null : values[i];
        if (da3 != null) {
            k4a k4a = (k4a) ((pk) oa3.c.getValue());
            long j = oa3.b;
            if (k4a.o(j)) {
                k4a.w(k4a, new o72(((p7b) k4a.y()).a.o(), j, da3));
            }
            pnf.o(oa3.X, ma3.a);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setLayoutParams(new ActionBar.LayoutParams(-1, -1));
        frameLayout.setAlpha(0.0f);
        return frameLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        je7 je7 = this.b;
        w7c w7c = ((oa3) je7.getValue()).o;
        gh7 Q = getViewLifecycleOwner().Q();
        fg7 fg7 = fg7.o;
        od2.L(new mqc(new ha3(tu0.g(w7c, Q, fg7), (Continuation) null, this)), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((oa3) je7.getValue()).X, getViewLifecycleOwner().Q(), fg7), new fa3((Continuation) null, this), 5), getViewLifecycleScope());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComplaintBottomSheet(Bundle bundle, int i, z84 z84) {
        this((i & 1) != 0 ? null : bundle);
    }

    public ComplaintBottomSheet(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = new fs(Long.class, "chat_id");
        this.b = createViewModelLazy(oa3.class, new ti2(23, new ea3(this, 0)));
        this.c = new khe(new hn2(15));
        this.o = new khe(new ea3(this, 1));
    }

    public ComplaintBottomSheet(long j) {
        this(dy7.g(new kpa("chat_id", Long.valueOf(j))));
    }
}
