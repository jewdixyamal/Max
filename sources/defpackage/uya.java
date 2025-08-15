package defpackage;

import java.util.Set;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* renamed from: uya  reason: default package */
public final /* synthetic */ class uya implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerContactsListWidget b;

    public /* synthetic */ uya(PickerContactsListWidget pickerContactsListWidget, int i) {
        this.a = i;
        this.b = pickerContactsListWidget;
    }

    public final Object invoke(Object obj) {
        pxa pxa;
        int i = this.a;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                PickerContactsListWidget pickerContactsListWidget = this.b;
                int j = pickerContactsListWidget.Z.j();
                nxa nxa = pickerContactsListWidget.X;
                int j2 = nxa.j() + j;
                CharSequence charSequence = (CharSequence) pickerContactsListWidget.n0().u0.a.getValue();
                if (!(!(charSequence == null || charSequence.length() == 0)) && intValue >= j && intValue < j2 && (pxa = (pxa) nxa.G(intValue - j)) != null) {
                    return pxa.c;
                }
                return null;
            case 1:
                PickerContactsListWidget pickerContactsListWidget2 = this.b;
                int j3 = pickerContactsListWidget2.Z.j();
                int j4 = pickerContactsListWidget2.X.j() + j3;
                CharSequence charSequence2 = (CharSequence) pickerContactsListWidget2.n0().u0.a.getValue();
                boolean z = false;
                if ((!(charSequence2 == null || charSequence2.length() == 0)) || (intValue >= j3 && intValue < j4)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                PickerContactsListWidget pickerContactsListWidget3 = this.b;
                int j5 = pickerContactsListWidget3.Z.j();
                nxa nxa2 = pickerContactsListWidget3.X;
                int j6 = nxa2.j() + j5;
                CharSequence charSequence3 = (CharSequence) pickerContactsListWidget3.n0().u0.a.getValue();
                boolean z2 = false;
                pxa pxa2 = (charSequence3 == null || charSequence3.length() == 0) ^ true ? (pxa) pickerContactsListWidget3.Y.G(intValue) : (intValue >= j5 && intValue < j6) ? (pxa) nxa2.G(intValue - j5) : null;
                if (pxa2 != null) {
                    z2 = ((Set) pickerContactsListWidget3.n0().Z.a.getValue()).contains(Long.valueOf(pxa2.a));
                }
                return Boolean.valueOf(z2);
        }
    }
}
