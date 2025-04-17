package equipamentos.mutifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {
    public void copiar() {
        System.out.println("Copiando via equipamento");
    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento");
    }

    public void imprimir() {
        System.out.println("Imprimindo via equipamento");
    }
}
