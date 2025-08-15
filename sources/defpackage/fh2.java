package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* renamed from: fh2  reason: default package */
public final /* synthetic */ class fh2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMediaTabWidget b;

    public /* synthetic */ fh2(ChatMediaTabWidget chatMediaTabWidget, int i) {
        this.a = i;
        this.b = chatMediaTabWidget;
    }

    public final Object invoke() {
        ChatMediaTabWidget chatMediaTabWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = ChatMediaTabWidget.w0;
                cla cla = new cla(chatMediaTabWidget.getContext(), 6);
                cla.setId(wea.p0);
                cla.setForm(uka.a);
                cla.setLeftActions(new kka(new we1(17)));
                return cla;
            case 1:
                bc7[] bc7Arr2 = ChatMediaTabWidget.w0;
                wja wja = new wja(chatMediaTabWidget.getContext(), (AttributeSet) null);
                wja.setId(wea.l0);
                wja.setTabMode(0);
                wja.setTabGravity(2);
                return wja;
            default:
                bc7[] bc7Arr3 = ChatMediaTabWidget.w0;
                ViewPager2 viewPager2 = new ViewPager2(chatMediaTabWidget.getContext());
                viewPager2.setId(wea.n0);
                viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewPager2.setOffscreenPageLimit(3);
                viewPager2.b(new lh0(2, chatMediaTabWidget));
                fm9.z(viewPager2);
                return viewPager2;
        }
    }
}
