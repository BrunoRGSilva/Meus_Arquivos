/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bruno.ricardo.c2;

/**
 *
 * @author DOM
 */
public class Hospital {

    private Integer internacoesRealizadas;
    private Integer cirurgiasRealizadas;
    private Integer altasRealizadas;

    public Hospital(Integer internacoesRealizadas, Integer cirurgiasRealizadas,
            Integer altasRealizadas) {
        this.internacoesRealizadas = internacoesRealizadas;
        this.cirurgiasRealizadas = cirurgiasRealizadas;
        this.altasRealizadas = altasRealizadas;
    }

    public Double calcularValorTotal(Paciente p) {

        Double valorTotal = p.getValorDiaria() * p.getQtdDias()
                + p.getValorCirurgia();

        return valorTotal;
    }

    public void registraInternacao(Paciente p) {

        if (p.getEstaInternado().equals(true)) {
            System.out.println("Este paciente já está internado");

        } else {
            p.setEstaInternado("internado");
            internacoesRealizadas++;
            p.setValorDiaria(120.00);
            System.out.println(String.format("O paciente %s de idPaciente %d "
                    + "está sendo internado por %d dias", p.getNome(),
                    p.getIdPaciente(), p.getQtdDias()));
        }
    }

    public void registraAlta(Paciente p) {

        if (p.getEstaInternado().equals(false)) {
            System.out.println("Este paciente não está internado");
        } else {
            altasRealizadas++;
            p.setEstaInternado("internado");
            System.out.println(String.format("O paciente $d de idPaciente %s esta "
                    + "recebendo alta e deve pagar", p.getNome(), p.getIdPaciente(), calcularValorTotal(p)));

        }
    }

    public void registraCirurgia(Paciente p) {

        if (p.getFoiOperado().equals(false)) {

            p.setFoiOperado("operado");
            cirurgiasRealizadas++;
            System.out.println(String.format("O paciente $s de idPaciente %d foi "
                    + "operado e o preço da cirurgia foi $.2f", p.getNome(),
                    p.getIdPaciente(), p.getValorCirurgia()));

        } else {
            System.out.println("Este paciente não está internado");
        }

    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("\n RELATÓRIO:\n");
        str.append("  INTERNAÇÕES REALIZADAS: %d\n");
        str.append("  CIRURGIAS REALIZADAS: %d\n");
        str.append("  ALTAS REALIZADAS: %d\n");
        str.append("  VALOR DA CIRUGIA: %2.f\n");

        return String.format(str.toString(),
                this.internacoesRealizadas,
                this.cirurgiasRealizadas, this.altasRealizadas);
    }
}
