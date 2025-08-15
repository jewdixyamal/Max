package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: r57  reason: default package */
public final class r57 extends ConstraintLayout implements kre {
    public final /* synthetic */ int G0 = 1;
    public final Object H0;

    public r57(VpnPanelWidget vpnPanelWidget, Context context) {
        super(context, (AttributeSet) null);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        appCompatImageView.setLayoutParams(new ti3(-2, -2));
        appCompatImageView.setId(rvb.call_screen_vpn_connection_icon);
        appCompatImageView.setImageDrawable(kt3.b(appCompatImageView.getContext(), ztb.ic_connection_fill_28));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(Color.parseColor("#FFD60A")));
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setLayoutParams(new ti3(-2, -2));
        oneMeButton.setId(rvb.call_screen_vpn_dismiss_button_id);
        oneMeButton.setSize(c7a.a);
        oneMeButton.setAppearance(z6a.X);
        oneMeButton.setText((CharSequence) oneMeButton.getContext().getString(f0c.call_screen_snackbar_button_text));
        oneMeButton.setMode(b7a.o);
        oneMeButton.setOnClickListener(new elb(15, (Object) vpnPanelWidget));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        appCompatTextView.setLayoutParams(new ti3(0, -2));
        appCompatTextView.setId(rvb.call_screen_vpn_title_id);
        i4f.l.b(appCompatTextView, du4.b);
        pq9 pq9 = qp4.u0;
        pq9.j(appCompatTextView).getClass();
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setText(appCompatTextView.getContext().getString(f0c.call_screen_snackbar_title));
        appCompatTextView.setMaxLines(2);
        this.H0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), (AttributeSet) null);
        appCompatTextView2.setId(rvb.call_screen_vpn_caption_id);
        appCompatTextView2.setLayoutParams(new ti3(0, -2));
        i4f.n.b(appCompatTextView2, du4.b);
        pq9.j(appCompatTextView2).getClass();
        appCompatTextView2.setTextColor(-1);
        appCompatTextView2.setText(appCompatTextView2.getContext().getString(f0c.call_screen_snackbar_caption));
        appCompatTextView2.setMaxLines(2);
        setId(rvb.call_screen_vpn_container_id);
        setLayoutParams(new ti3(-1, -2));
        setMinimumHeight(tu0.G(((float) 56) * fk4.d().getDisplayMetrics().density));
        float f = (float) 12;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
        setPadding(G, G, G, G);
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 16.0f));
        setBackgroundColor(pq9.j(this).b().d);
        addView(appCompatImageView);
        addView(oneMeButton);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        dj3 q = fp3.q(this);
        int id = appCompatTextView.getId();
        q.d(id, 6, appCompatImageView.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id, 4));
        q.d(id, 3, 0, 3);
        q.d(id, 7, oneMeButton.getId(), 6);
        new l2a(q, 7, id, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        q.d(id, 4, appCompatTextView2.getId(), 3);
        int id2 = appCompatImageView.getId();
        q.d(id2, 6, 0, 6);
        q.d(id2, 3, 0, 3);
        q.d(id2, 4, 0, 4);
        int id3 = appCompatTextView2.getId();
        q.d(id3, 6, appCompatImageView.getId(), 7);
        new l2a(q, 6, id3, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f));
        q.d(id3, 7, oneMeButton.getId(), 6);
        new l2a(q, 7, id3, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        q.d(id3, 3, appCompatTextView.getId(), 4);
        new l2a(q, 3, id3, 4).e(tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density));
        int id4 = oneMeButton.getId();
        q.d(id4, 3, 0, 3);
        q.d(id4, 7, 0, 7);
        q.d(id4, 4, 0, 4);
        q.a(this);
    }

    public final void onThemeChanged(fka fka) {
        Object obj = this.H0;
        switch (this.G0) {
            case 0:
                bc7[] bc7Arr = InviteByPhoneScreen.B0;
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) obj;
                inviteByPhoneScreen.getClass();
                bc7[] bc7Arr2 = InviteByPhoneScreen.B0;
                ((TextView) inviteByPhoneScreen.Y.T0(inviteByPhoneScreen, bc7Arr2[1])).setTextColor(fka.getText().e);
                ((TextView) inviteByPhoneScreen.Z.T0(inviteByPhoneScreen, bc7Arr2[2])).setTextColor(fka.getText().g);
                AppCompatTextView appCompatTextView = inviteByPhoneScreen.v0;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextColor(fka.getText().b);
                }
                inviteByPhoneScreen.o0().onThemeChanged(fka);
                inviteByPhoneScreen.n0().onThemeChanged(fka);
                ((cla) inviteByPhoneScreen.u0.T0(inviteByPhoneScreen, bc7Arr2[5])).onThemeChanged(fka);
                return;
            default:
                setBackgroundColor(fka.b().d);
                ((AppCompatTextView) obj).setTextColor(-1);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r57(InviteByPhoneScreen inviteByPhoneScreen, Context context) {
        super(context);
        this.H0 = inviteByPhoneScreen;
    }
}
