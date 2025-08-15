package defpackage;

import android.util.AttributeSet;
import androidx.viewpager2.widget.ViewPager2;
import one.me.chats.picker.chats.PickerChatsTabWidget;

/* renamed from: nya  reason: default package */
public final /* synthetic */ class nya implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsTabWidget b;

    public /* synthetic */ nya(PickerChatsTabWidget pickerChatsTabWidget, int i) {
        this.a = i;
        this.b = pickerChatsTabWidget;
    }

    public final Object invoke() {
        PickerChatsTabWidget pickerChatsTabWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = PickerChatsTabWidget.y0;
                wja wja = new wja(pickerChatsTabWidget.getContext(), (AttributeSet) null);
                wja.setId(p8a.e);
                wja.setTabMode(0);
                return wja;
            default:
                bc7[] bc7Arr2 = PickerChatsTabWidget.y0;
                ViewPager2 viewPager2 = new ViewPager2(pickerChatsTabWidget.getContext());
                viewPager2.setId(p8a.d);
                fm9.z(viewPager2);
                return viewPager2;
        }
    }
}
