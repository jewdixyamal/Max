package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: a94  reason: default package */
public final class a94 implements ct3 {
    public static final a94 c = new a94(Collections.emptyMap());
    public int a;
    public final Map b;

    public a94(Map map) {
        this.b = Collections.unmodifiableMap(map);
    }

    public static boolean c(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final a94 b(h7b h7b) {
        byte[] bArr;
        Map map = this.b;
        HashMap hashMap = new HashMap(map);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList((ArrayList) h7b.c));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        HashMap hashMap2 = new HashMap((HashMap) h7b.b);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr2, bArr2.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(hashMap2).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bArr = ((String) value2).getBytes(b52.c);
            } else if (value2 instanceof byte[]) {
                bArr = (byte[]) value2;
            } else {
                throw new IllegalArgumentException();
            }
            hashMap.put(str, bArr);
        }
        return c(map, hashMap) ? this : new a94(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a94.class != obj.getClass()) {
            return false;
        }
        return c(this.b, ((a94) obj).b);
    }

    public final int hashCode() {
        if (this.a == 0) {
            int i = 0;
            for (Map.Entry entry : this.b.entrySet()) {
                i += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.a = i;
        }
        return this.a;
    }
}
