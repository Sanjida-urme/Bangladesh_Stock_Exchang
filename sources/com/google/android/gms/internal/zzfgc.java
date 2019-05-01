package com.google.android.gms.internal;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzfgc<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzkra;
    private final int zzpej;
    private List<zzfgh> zzpek;
    private Map<K, V> zzpel;
    private volatile zzfgj zzpem;
    private Map<K, V> zzpen;

    private zzfgc(int i) {
        this.zzpej = i;
        this.zzpek = Collections.emptyList();
        this.zzpel = Collections.emptyMap();
        this.zzpen = Collections.emptyMap();
    }

    private final int zza(K k) {
        int compareTo;
        int size = this.zzpek.size() - 1;
        if (size >= 0) {
            compareTo = k.compareTo((Comparable) ((zzfgh) this.zzpek.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        compareTo = 0;
        while (compareTo <= size) {
            int i = (compareTo + size) / 2;
            int compareTo2 = k.compareTo((Comparable) ((zzfgh) this.zzpek.get(i)).getKey());
            if (compareTo2 < 0) {
                size = i - 1;
            } else if (compareTo2 <= 0) {
                return i;
            } else {
                compareTo = i + 1;
            }
        }
        return -(compareTo + 1);
    }

    private final void zzcwm() {
        if (this.zzkra) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzcwn() {
        zzcwm();
        if (this.zzpel.isEmpty() && !(this.zzpel instanceof TreeMap)) {
            this.zzpel = new TreeMap();
            this.zzpen = ((TreeMap) this.zzpel).descendingMap();
        }
        return (SortedMap) this.zzpel;
    }

    static <FieldDescriptorType extends zzfel<FieldDescriptorType>> zzfgc<FieldDescriptorType, Object> zzlq(int i) {
        return new zzfgd(i);
    }

    private final V zzls(int i) {
        zzcwm();
        V value = ((zzfgh) this.zzpek.remove(i)).getValue();
        if (!this.zzpel.isEmpty()) {
            Iterator it = zzcwn().entrySet().iterator();
            this.zzpek.add(new zzfgh(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        zzcwm();
        if (!this.zzpek.isEmpty()) {
            this.zzpek.clear();
        }
        if (!this.zzpel.isEmpty()) {
            this.zzpel.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zza(comparable) < 0) {
            if (!this.zzpel.containsKey(comparable)) {
                return false;
            }
        }
        return true;
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.zzpem == null) {
            this.zzpem = new zzfgj();
        }
        return this.zzpem;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfgc)) {
            return super.equals(obj);
        }
        zzfgc zzfgc = (zzfgc) obj;
        int size = size();
        if (size != zzfgc.size()) {
            return false;
        }
        int zzcwk = zzcwk();
        if (zzcwk != zzfgc.zzcwk()) {
            return entrySet().equals(zzfgc.entrySet());
        }
        for (int i = 0; i < zzcwk; i++) {
            if (!zzlr(i).equals(zzfgc.zzlr(i))) {
                return false;
            }
        }
        return zzcwk != size ? this.zzpel.equals(zzfgc.zzpel) : true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        return zza >= 0 ? ((zzfgh) this.zzpek.get(zza)).getValue() : this.zzpel.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < zzcwk(); i2++) {
            i += ((zzfgh) this.zzpek.get(i2)).hashCode();
        }
        return this.zzpel.size() > 0 ? i + this.zzpel.hashCode() : i;
    }

    public final boolean isImmutable() {
        return this.zzkra;
    }

    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((Comparable) obj, obj2);
    }

    public V remove(Object obj) {
        zzcwm();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        return zza >= 0 ? zzls(zza) : this.zzpel.isEmpty() ? null : this.zzpel.remove(comparable);
    }

    public int size() {
        return this.zzpek.size() + this.zzpel.size();
    }

    public final V zza(K k, V v) {
        zzcwm();
        int zza = zza((Comparable) k);
        if (zza >= 0) {
            return ((zzfgh) this.zzpek.get(zza)).setValue(v);
        }
        zzcwm();
        if (this.zzpek.isEmpty() && !(this.zzpek instanceof ArrayList)) {
            this.zzpek = new ArrayList(this.zzpej);
        }
        zza = -(zza + 1);
        if (zza >= this.zzpej) {
            return zzcwn().put(k, v);
        }
        if (this.zzpek.size() == this.zzpej) {
            zzfgh zzfgh = (zzfgh) this.zzpek.remove(this.zzpej - 1);
            zzcwn().put((Comparable) zzfgh.getKey(), zzfgh.getValue());
        }
        this.zzpek.add(zza, new zzfgh(this, k, v));
        return null;
    }

    public void zzbin() {
        if (!this.zzkra) {
            this.zzpel = this.zzpel.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzpel);
            this.zzpen = this.zzpen.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzpen);
            this.zzkra = true;
        }
    }

    public final int zzcwk() {
        return this.zzpek.size();
    }

    public final Iterable<Entry<K, V>> zzcwl() {
        return this.zzpel.isEmpty() ? zzfge.zzcwo() : this.zzpel.entrySet();
    }

    public final Entry<K, V> zzlr(int i) {
        return (Entry) this.zzpek.get(i);
    }
}
