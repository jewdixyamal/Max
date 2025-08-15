package one.me.dialogs.share.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B=\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0004\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/dialogs/share/media/ChatMediaDownloadBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "attachId", "", "localAttachId", "", "cause", "snackbarBottomMargin", "", "forceDarkTheme", "(JJLjava/lang/String;ILjava/lang/Integer;Ljava/lang/Boolean;)V", "share-media_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatMediaDownloadBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ bc7[] E0;
    public final je7 A0;
    public og4 B0;
    public final fs C0;
    public final fs D0;
    public final je7 y0;
    public final je7 z0;

    static {
        Class<ChatMediaDownloadBottomSheet> cls = ChatMediaDownloadBottomSheet.class;
        E0 = new bc7[]{new hob(cls, "forceDarkTheme", "getForceDarkTheme()Z", 0), zr6.e(nec.a, cls, "snackbarBottomMargin", "getSnackbarBottomMargin()Ljava/lang/Integer;", 0)};
    }

    public ChatMediaDownloadBottomSheet(Bundle bundle) {
        super(bundle);
        je7 createViewModelLazy = createViewModelLazy(ye2.class, new s(27, new m52(11)));
        this.y0 = createViewModelLazy;
        this.z0 = tu0.r(3, new md1(9, this));
        this.A0 = rkd.a.getAccessor().d(wha.class);
        this.C0 = new fs(Boolean.class, "arg:force_dark");
        this.D0 = new fs(Integer.class, "arg:snack_bot_margin");
        ye2 ye2 = (ye2) createViewModelLazy.getValue();
        long j = bundle.getLong("arg:msg_id");
        long j2 = bundle.getLong("arg:attach_id");
        String string = bundle.getString("arg:local_attach_id");
        if (string != null) {
            c32 c32 = en4.a;
            int i = bundle.getInt("arg:cause");
            c32.getClass();
            ye2.y0 = pnf.n(ye2, ((w9a) ye2.c).b(), (vx3) null, new re2(ye2, j, string, (en4) en4.u0.get(i), j2, (Continuation) null), 2);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void A0(int i, int i2) {
        wha wha = (wha) this.A0.getValue();
        wha.h(z7.B(getContext(), i));
        wha.e(new kia(i2));
        bc7 bc7 = E0[1];
        Integer num = (Integer) this.D0.a(this);
        if (num != null) {
            wha.c(new eia(0, 0, num.intValue(), 3));
        }
        wha.i();
    }

    public final z5b n0() {
        return new ke2(this, 0);
    }

    public final void onChangeStarted(zu3 zu3, av3 av3) {
        super.onChangeStarted(zu3, av3);
        this.B0 = zu3 instanceof og4 ? (og4) zu3 : null;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ((ye2) this.y0.getValue()).r();
        this.B0 = null;
    }

    public final void onViewCreated(View view) {
        od2.L(new zn5(tu0.g(((ye2) this.y0.getValue()).x0, getViewLifecycleOwner().Q(), fg7.o), new le2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final fka q0() {
        fka fka = qp4.u0.o(getContext()).c;
        bc7 bc7 = E0[0];
        if (((Boolean) this.C0.a(this)).booleanValue()) {
            return fka;
        }
        return null;
    }

    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        Context context2 = frameLayout2.getContext();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, tu0.G(((float) 223) * fk4.d().getDisplayMetrics().density));
        FrameLayout frameLayout3 = new FrameLayout(context2);
        frameLayout3.setLayoutParams(layoutParams2);
        TextView textView = new TextView(frameLayout3.getContext());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams3.bottomMargin = tu0.G(((float) 27) * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams3);
        textView.setGravity(17);
        fka q0 = q0();
        if (q0 == null) {
            q0 = qp4.u0.j(textView);
        }
        textView.setTextColor(q0.getText().e);
        ArrayList arrayList = qqe.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (a10) this.z0.getValue(), (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
        textView.setText(p0c.media_share_dialog_generic_share_text);
        frameLayout3.addView(textView);
        frameLayout2.addView(frameLayout3);
        OneMeButton oneMeButton = new OneMeButton(frameLayout2.getContext(), (AttributeSet) null);
        oneMeButton.setLayoutParams(new FrameLayout.LayoutParams(-1, tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density), 81));
        oneMeButton.setCustomTheme(q0());
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.c);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setText(yoc.h);
        tu0.K(oneMeButton, 300, new e0d(4, this));
        frameLayout2.addView(oneMeButton);
        return frameLayout2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChatMediaDownloadBottomSheet(long j, long j2, String str, int i, Integer num, Boolean bool) {
        this(dy7.g(new kpa("arg:msg_id", Long.valueOf(j)), new kpa("arg:attach_id", Long.valueOf(j2)), new kpa("arg:local_attach_id", str), new kpa("arg:cause", Integer.valueOf(i)), new kpa("arg:snack_bot_margin", num), new kpa("arg:force_dark", Boolean.valueOf(bool != null ? bool.booleanValue() : false))));
    }
}
