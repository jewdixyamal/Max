package one.me.settings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/settings/SettingsAvatarBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "fed", "settings-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class SettingsAvatarBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] C0;
    public final fs A0 = new fs(ArrayList.class, new ArrayList(), "buttons");
    public final fs B0 = new fs(Boolean.class, Boolean.FALSE, "callback_sent");
    public final fs y0;
    public final fs z0;

    static {
        Class<SettingsAvatarBottomSheet> cls = SettingsAvatarBottomSheet.class;
        C0 = new bc7[]{new hob(cls, "title", "getTitle()Lone/me/sdk/uikit/common/TextSource;", 0), z7b.g(nec.a, cls, "description", "getDescription()Lone/me/sdk/uikit/common/TextSource;", 0), new hob(cls, "buttons", "getButtons()Ljava/util/ArrayList;", 0), new hob(cls, ApiProtocol.PARAM_PAYLOAD, "getPayload()Landroid/os/Bundle;", 0), new oi9(cls, "isCallbackSent", "isCallbackSent()Z")};
    }

    public SettingsAvatarBottomSheet(Bundle bundle, z84 z84) {
        super(bundle);
        Class<jqe> cls = jqe.class;
        this.y0 = new fs(cls, "title");
        this.z0 = new fs(cls, (Object) null, "description");
    }

    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        bc7[] bc7Arr = C0;
        bc7 bc7 = bc7Arr[0];
        CharSequence b = ((jqe) this.y0.a(this)).b(getContext());
        if (b != null) {
            bc7 bc72 = bc7Arr[1];
            jqe jqe = (jqe) this.z0.a(this);
            CharSequence b2 = jqe != null ? jqe.b(layoutInflater.getContext()) : null;
            bc7 bc73 = bc7Arr[2];
            return new ged(this, b, b2, (ArrayList) this.A0.a(this), layoutInflater.getContext());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public SettingsAvatarBottomSheet() {
        super((Bundle) null);
        Class<jqe> cls = jqe.class;
        this.y0 = new fs(cls, "title");
        this.z0 = new fs(cls, (Object) null, "description");
    }
}
