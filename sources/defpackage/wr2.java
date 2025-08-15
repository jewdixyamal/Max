package defpackage;

import android.graphics.RectF;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: wr2  reason: default package */
public final /* synthetic */ class wr2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatTitleIconScreen b;

    public /* synthetic */ wr2(ChatTitleIconScreen chatTitleIconScreen, int i) {
        this.a = i;
        this.b = chatTitleIconScreen;
    }

    public final Object invoke() {
        int i;
        int i2;
        int i3;
        int i4;
        ChatTitleIconScreen chatTitleIconScreen = this.b;
        boolean z = false;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ChatTitleIconScreen.z0;
                chatTitleIconScreen.r0().y0.m((Object) null, new ds2((String) null, (String) null, (RectF) null));
                return e5f.a;
            case 1:
                bc7[] bc7Arr2 = ChatTitleIconScreen.z0;
                int ordinal = chatTitleIconScreen.q0().ordinal();
                if (ordinal == 0) {
                    return wuc.CREATE_CHAT_INFO;
                }
                if (ordinal == 1) {
                    return wuc.CREATE_CHANNEL_INFO;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                bc7[] bc7Arr3 = ChatTitleIconScreen.z0;
                cla cla = new cla(chatTitleIconScreen.getContext(), 6);
                cla.setId(zia.j);
                cla.setLayoutParams(new ti3(-1, -2));
                cla.setForm(uka.a);
                int ordinal2 = chatTitleIconScreen.q0().ordinal();
                if (ordinal2 == 0) {
                    i = aja.s;
                } else if (ordinal2 == 1) {
                    i = aja.t;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                cla.setTitle(i);
                cla.setLeftActions(new kka(new l(27, cla)));
                return cla;
            case 3:
                bc7[] bc7Arr4 = ChatTitleIconScreen.z0;
                TextView textView = new TextView(chatTitleIconScreen.getContext());
                textView.setId(zia.f);
                textView.setLayoutParams(new ti3(0, -2));
                textView.setGravity(17);
                float f = (float) 12;
                textView.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
                int ordinal3 = chatTitleIconScreen.q0().ordinal();
                if (ordinal3 == 0) {
                    i2 = aja.n;
                } else if (ordinal3 == 1) {
                    i2 = aja.o;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                textView.setText(i2);
                v3c.y(new v9(3, (Continuation) null, 6), textView);
                return textView;
            case 4:
                bc7[] bc7Arr5 = ChatTitleIconScreen.z0;
                s5a s5a = new s5a(chatTitleIconScreen.getContext());
                s5a.setId(zia.h);
                float f2 = (float) 96;
                s5a.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                s5a.j(s5a, kt3.b(chatTitleIconScreen.getContext(), woc.h0), (m5a) null, 30);
                s5a.setAvatarShape(j5a.a);
                tu0.K(s5a, 300, new vr2(chatTitleIconScreen, 0));
                s5a.setCloseBadgeClickListener(new wr2(chatTitleIconScreen, 0));
                return s5a;
            case 5:
                bc7[] bc7Arr6 = ChatTitleIconScreen.z0;
                cka cka = new cka(chatTitleIconScreen.getContext());
                cka.setId(zia.i);
                cka.setLayoutParams(new ti3(0, -2));
                float f3 = (float) 12;
                cka.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f3), 0, tu0.G(f3 * fk4.d().getDisplayMetrics().density), 0);
                int ordinal4 = chatTitleIconScreen.q0().ordinal();
                if (ordinal4 == 0) {
                    i3 = aja.q;
                } else if (ordinal4 == 1) {
                    i3 = aja.r;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                cka.setHint(z7.B(cka.getContext(), i3));
                cka.setText(chatTitleIconScreen.r0().G0);
                cka.setBackgroundColorAttr(Integer.valueOf(wfa.L));
                qyc qyc = (qyc) ((y7d) chatTitleIconScreen.b.getValue());
                qyc.getClass();
                cka.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) qyc.q(PmsKey.f76maxthemelength, (long) 200))});
                v3c.y(new xr2(3, (Continuation) null, 0), cka);
                cka.b(new ur2(chatTitleIconScreen, 0));
                return cka;
            case 6:
                bc7[] bc7Arr7 = ChatTitleIconScreen.z0;
                xh4 xh4 = new xh4(chatTitleIconScreen.getContext());
                xh4.setId(zia.g);
                ti3 ti3 = new ti3(0, -2);
                float f4 = (float) 12;
                ti3.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f4));
                ti3.setMarginEnd(tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                xh4.setLayoutParams(ti3);
                xh4.setMaxCount(((qyc) ((y7d) chatTitleIconScreen.b.getValue())).r());
                xh4.setHint(new eqe(aja.p));
                xh4.setText(chatTitleIconScreen.r0().H0);
                xh4.setBackgroundColorAttr(Integer.valueOf(wfa.L));
                xh4.setHintColorAttr(wfa.X);
                v3c.y(new xh0(3, (Continuation) null, 4), xh4);
                xh4.t0.addTextChangedListener(new vf1(new ur2(chatTitleIconScreen, 1), 2, xh4));
                return xh4;
            default:
                bc7[] bc7Arr8 = ChatTitleIconScreen.z0;
                OneMeButton oneMeButton = new OneMeButton(chatTitleIconScreen.getContext(), (AttributeSet) null);
                oneMeButton.setId(zia.e);
                ti3 ti32 = new ti3(0, -2);
                float f5 = (float) 12;
                ti32.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f5));
                ti32.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f5));
                ti32.bottomMargin = tu0.G(f5 * fk4.d().getDisplayMetrics().density);
                oneMeButton.setLayoutParams(ti32);
                int ordinal5 = chatTitleIconScreen.q0().ordinal();
                if (ordinal5 == 0) {
                    i4 = aja.l;
                } else if (ordinal5 == 1) {
                    i4 = aja.m;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                oneMeButton.setText(i4);
                oneMeButton.setSize(c7a.c);
                oneMeButton.setMode(b7a.a);
                oneMeButton.setAppearance(z6a.o);
                ks2 r0 = chatTitleIconScreen.r0();
                String str = chatTitleIconScreen.r0().G0;
                r0.getClass();
                if (!w9e.C0(str)) {
                    int length = str.length();
                    qyc qyc2 = (qyc) r0.o;
                    qyc2.getClass();
                    if (length <= ((int) qyc2.q(PmsKey.f76maxthemelength, (long) 200))) {
                        z = true;
                    }
                }
                oneMeButton.setEnabled(z);
                tu0.K(oneMeButton, 300, new vr2(chatTitleIconScreen, 1));
                return oneMeButton;
        }
    }
}
