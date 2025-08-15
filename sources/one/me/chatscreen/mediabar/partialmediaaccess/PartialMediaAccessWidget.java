package one.me.chatscreen.mediabar.partialmediaaccess;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/chatscreen/mediabar/partialmediaaccess/PartialMediaAccessWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class PartialMediaAccessWidget extends Widget {
    public static final /* synthetic */ bc7[] o;
    public final je7 a;
    public final qm0 b;
    public final qm0 c;

    static {
        Class<PartialMediaAccessWidget> cls = PartialMediaAccessWidget.class;
        o = new bc7[]{new hob(cls, "titleSubtitleContent", "getTitleSubtitleContent()Landroid/widget/LinearLayout;", 0), zr6.e(nec.a, cls, "content", "getContent()Landroid/widget/LinearLayout;", 0)};
    }

    public PartialMediaAccessWidget() {
        this((Bundle) null, 1, (z84) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bc7 bc7 = o[1];
        return (LinearLayout) this.c.getValue();
    }

    public PartialMediaAccessWidget(Bundle bundle) {
        super(bundle, 0, 2, (z84) null);
        this.a = fua.a.b();
        this.b = binding(new cqa(this, 0));
        this.c = binding(new cqa(this, 1));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PartialMediaAccessWidget(Bundle bundle, int i, z84 z84) {
        this((i & 1) != 0 ? null : bundle);
    }
}
