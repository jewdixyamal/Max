package defpackage;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: rb3  reason: default package */
public final /* synthetic */ class rb3 implements n3a {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb3 b;

    public /* synthetic */ rb3(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                yb3 yb3 = this.b;
                Bundle c = ((mm) yb3.o.o).c("android:support:activity-result");
                if (c != null) {
                    wb3 wb3 = yb3.s0;
                    wb3.getClass();
                    ArrayList<Integer> integerArrayList = c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            wb3.d.addAll(stringArrayList2);
                        }
                        Bundle bundle = c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = wb3.g;
                        if (bundle != null) {
                            bundle2.putAll(bundle);
                        }
                        int size = stringArrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str = stringArrayList.get(i);
                            LinkedHashMap linkedHashMap = wb3.b;
                            boolean containsKey = linkedHashMap.containsKey(str);
                            LinkedHashMap linkedHashMap2 = wb3.a;
                            if (containsKey) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    f8.b(linkedHashMap2);
                                    linkedHashMap2.remove(num);
                                }
                            }
                            int intValue = integerArrayList.get(i).intValue();
                            String str2 = stringArrayList.get(i);
                            linkedHashMap2.put(Integer.valueOf(intValue), str2);
                            linkedHashMap.put(str2, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                z06 z06 = (z06) ((b) this.b).E0.a;
                z06.w0.b(z06, z06, (a) null);
                return;
        }
    }
}
