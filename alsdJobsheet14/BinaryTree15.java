public class BinaryTree15 {
    Node15 root;

    public BinaryTree15() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void addR(Mahasiswa15 data) {
        root = addRekursif(root, data);
    }

    public Node15 addRekursif(Node15 current, Mahasiswa15 data) {
        if (current == null) return new Node15(data);
        if (data.ipk < current.data.ipk) current.left = addRekursif(current.left, data);
        else if (data.ipk > current.data.ipk) current.right = addRekursif(current.right, data);

        return current;
    }

    public void add(Mahasiswa15 data) {
        Node15 newNode = new Node15(data);
        if (isEmpty()) root = newNode;
        else {
            Node15 current = root;
            Node15 parent = null;
            while (true) {
                parent = current;
                if (data.ipk < current.data.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node15 current = root;
        while (current != null) {
            if (current.data.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.data.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node15 node) {
        if (node != null) {
            node.data.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        } 
    }

    void traverseInOrder(Node15 node) {
        if (node != null)  {
            traverseInOrder(node.left);
            node.data.tampilInformasi();
            traverseInOrder(node.right);
        } 
    }

    void traversePostOrder(Node15 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.tampilInformasi();
        }
    }

    void cariMinIPK() {
        Node15 current = root;
        while (current.left != null) current = current.left;
        current.data.tampilInformasi();
    }

    void cariMaxIPK() {
        Node15 current = root;
        while (current.right != null) current = current.right;
        current.data.tampilInformasi();
    }

    void tampilMahasiswaIPKdiAtas(double ipk, Node15 node) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(ipk, node.left);
            if (node.data.ipk > ipk) node.data.tampilInformasi();
            tampilMahasiswaIPKdiAtas(ipk, node.right);
        }
    }
    
    // digunakan ketika proses penghapusan node yang memiliki 2 child
    Node15 getSuccessor(Node15 del) { 
        Node15 successor = del.right;
        Node15 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            console.log("Binary tree kosong\n");
            return;
        }

        // cari node (current) yang akan dihapus
        Node15 parent = root;
        Node15 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data.ipk == ipk) break;
            else if (ipk < current.data.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.data.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        // penghapusan
        if (current == null) console.log("Data tidak ditemukan");
        else {
            // jika tidak ada leaf, node dihapus
            if (current.left == null && current.right == null) { 
                if (current == root) root = null;
                else {
                    if (isLeftChild) parent.left = null;
                    else parent.right = null;
                }
            // jika hanya 1 anak (kanan)
            } else if (current.left == null) {
                if (current == root) root = current.right;
                else {
                    if (isLeftChild) parent.left = current.right;
                    else parent.right = current.right;
                }
            // jika hanya 1 anak (kiri)    
            } else if (current.right == null) {
                if (current == root) root = current.left;
                else {
                    if (isLeftChild) parent.left = current.left;
                    else parent.right = current.left;
                }
            // jika 2 anak     
            } else {
                Node15 successor = getSuccessor(current);
                console.log("Jika 2 anak, current: \n");
                successor.data.tampilInformasi();
                if (current == root) root = successor;
                else {
                    if (isLeftChild) parent.left = successor;
                    else parent.right = successor;
                }
                successor.left = current.left;
            }
        }
    }

    
}
