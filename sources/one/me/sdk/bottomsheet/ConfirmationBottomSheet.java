package one.me.sdk.bottomsheet;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0015\b\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lone/me/sdk/bottomsheet/ConfirmationBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "lg3", "mg3", "ng3", "bottom-sheet_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ConfirmationBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] G0;
    public final fs A0;
    public final fs B0;
    public final fs C0;
    public final boolean D0;
    public final fs E0;
    public final bvc F0;
    public final fs y0;
    public final fs z0;

    static {
        Class<ConfirmationBottomSheet> cls = ConfirmationBottomSheet.class;
        G0 = new bc7[]{new hob(cls, "icon", "getIcon()Ljava/lang/Integer;", 0), z7b.g(nec.a, cls, "title", "getTitle()Lone/me/sdk/uikit/common/TextSource;", 0), new hob(cls, "description", "getDescription()Lone/me/sdk/uikit/common/TextSource;", 0), new hob(cls, "buttons", "getButtons()Ljava/util/ArrayList;", 0), new hob(cls, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), new oi9(cls, "isCallbackSent", "isCallbackSent()Z")};
    }

    public ConfirmationBottomSheet() {
        this((Bundle) null, 1, (z84) null);
    }

    public final bvc getScreenDelegate() {
        return this.F0;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [uu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u0() {
        /*
            r4 = this;
            uu3 r0 = r4.getTargetController()
            boolean r1 = r0 instanceof defpackage.ng3
            r2 = 0
            if (r1 == 0) goto L_0x000c
            ng3 r0 = (defpackage.ng3) r0
            goto L_0x000d
        L_0x000c:
            r0 = r2
        L_0x000d:
            if (r0 == 0) goto L_0x0012
            r0.G()
        L_0x0012:
            r0 = 5
            bc7[] r1 = G0
            r0 = r1[r0]
            fs r0 = r4.E0
            java.lang.Object r0 = r0.a(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0040
            uu3 r0 = r4.getTargetController()
            boolean r3 = r0 instanceof defpackage.ng3
            if (r3 == 0) goto L_0x0030
            r2 = r0
            ng3 r2 = (defpackage.ng3) r2
        L_0x0030:
            if (r2 == 0) goto L_0x0040
            r0 = 4
            r0 = r1[r0]
            fs r0 = r4.C0
            java.lang.Object r4 = r0.a(r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            r2.E(r4)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.bottomsheet.ConfirmationBottomSheet.u0():void");
    }

    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        bc7[] bc7Arr = G0;
        bc7 bc7 = bc7Arr[1];
        CharSequence b = ((jqe) this.z0.a(this)).b(getContext());
        if (b != null) {
            bc7 bc72 = bc7Arr[2];
            jqe jqe = (jqe) this.A0.a(this);
            CharSequence b2 = jqe != null ? jqe.b(layoutInflater.getContext()) : null;
            bc7 bc73 = bc7Arr[3];
            return new og3(this, b, b2, (ArrayList) this.B0.a(this), layoutInflater.getContext());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final boolean y0() {
        return this.D0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConfirmationBottomSheet(Bundle bundle, int i, z84 z84) {
        this((i & 1) != 0 ? null : bundle);
    }

    public ConfirmationBottomSheet(Bundle bundle) {
        super(bundle);
        bvc bvc;
        Object obj;
        Object obj2 = null;
        this.y0 = new fs(Integer.class, (Object) null, "icon");
        Class<jqe> cls = jqe.class;
        this.z0 = new fs(cls, "title");
        this.A0 = new fs(cls, (Object) null, "description");
        this.B0 = new fs(ArrayList.class, new ArrayList(), "buttons");
        this.C0 = new fs(Bundle.class, (Object) null, ApiProtocol.PARAM_PAYLOAD);
        this.D0 = getArgs().getBoolean("memorize_keyboard", true);
        this.E0 = new fs(Boolean.class, Boolean.FALSE, "callback_sent");
        String string = getArgs().getString("stat_screen");
        if (string != null) {
            try {
                obj = wuc.valueOf(string);
            } catch (Throwable th) {
                obj = new njc(th);
            }
            wuc wuc = (wuc) (!(obj instanceof njc) ? obj : obj2);
            if (wuc != null) {
                bvc = new glc(wuc);
                this.F0 = bvc;
            }
        }
        bvc = super.getScreenDelegate();
        this.F0 = bvc;
    }
}
