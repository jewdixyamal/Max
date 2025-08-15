package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: fu4  reason: default package */
public abstract class fu4 {
    public static final HashMap a;
    public static final HashMap b;

    static {
        eu4 eu4;
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        eu4 eu42 = eu4.d;
        hashMap.put(1L, eu42);
        hashMap2.put(eu42, Collections.singletonList(1L));
        hashMap.put(2L, eu4.e);
        hashMap2.put((eu4) hashMap.get(2L), Collections.singletonList(2L));
        eu4 eu43 = eu4.f;
        hashMap.put(4L, eu43);
        hashMap2.put(eu43, Collections.singletonList(4L));
        eu4 eu44 = eu4.g;
        hashMap.put(8L, eu44);
        hashMap2.put(eu44, Collections.singletonList(8L));
        List asList = Arrays.asList(new Long[]{64L, 128L, 16L, 32L});
        Iterator it = asList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            eu4 = eu4.h;
            if (!hasNext) {
                break;
            }
            a.put((Long) it.next(), eu4);
        }
        b.put(eu4, asList);
        List asList2 = Arrays.asList(new Long[]{Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID), Long.valueOf(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH), 256L, 512L});
        Iterator it2 = asList2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            eu4 eu45 = eu4.i;
            if (hasNext2) {
                a.put((Long) it2.next(), eu45);
            } else {
                b.put(eu45, asList2);
                return;
            }
        }
    }

    public static Long a(eu4 eu4, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) b.get(eu4);
        if (list == null) {
            return null;
        }
        Set q = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (q.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
