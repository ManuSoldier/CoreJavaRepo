package com.chawadi.family.members.Collections.Streams.StreamsRunner;

import com.chawadi.family.members.Collections.Streams.MedicineDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MedicineDTORunner {

    public static void main(String[] args) {

        String[] AdvilIndegredients={    "Ibuprofen",
                "Croscarmellose sodium",
                "Colloidal silicon dioxide",
                "Hypromellose",
                "Microcrystalline cellulose"};
        MedicineDTO medicineDTO1=new MedicineDTO("Advil", 654321, "Pharmaceutical companies", LocalDate.of(2025,06,15), LocalDate.now(), 20, AdvilIndegredients);


        // Example 1: Advil
        String[] AdvilIngredients = {
                "Ibuprofen",
                "Croscarmellose sodium",
                "Colloidal silicon dioxide",
                "Hypromellose",
                "Microcrystalline cellulose"
        };
        MedicineDTO medicineDTO2 = new MedicineDTO("Advil", 654321, "omee", LocalDate.of(2025, 06, 15), LocalDate.now(), 20, AdvilIngredients);

        // Example 2: Tylenol
        String[] TylenolIngredients = {
                "Paracetamol",
                "Pregelatinized starch",
                "Corn starch",
                "Povidone",
                "Sodium starch glycolate"
        };
        MedicineDTO medicineDTO3 = new MedicineDTO("Tylenol", 123456, "Pfizer Companies", LocalDate.of(2024, 12, 31), LocalDate.now(), 15, TylenolIngredients);

        // Example 3: Zyrtec
        String[] ZyrtecIngredients = {
                "Cetirizine hydrochloride",
                "Lactose monohydrate",
                "Microcrystalline cellulose",
                "Colloidal silicon dioxide",
                "Magnesium stearate"
        };
        MedicineDTO medicineDTO4= new MedicineDTO("Zyrtec", 789012, "Johnson & Johnson Companies", LocalDate.of(2023, 10, 20), LocalDate.now(), 30, ZyrtecIngredients);

        // Example 4: Nexium
        String[] NexiumIngredients = {
                "Esomeprazole",
                "Glycerol monostearate",
                "Hydroxypropyl cellulose",
                "Iron oxide",
                "Titanium dioxide"
        };
        MedicineDTO medicineDTO5 = new MedicineDTO("Nexium", 567890, "GlaxoSmithKline Companies", LocalDate.of(2024, 8, 18), LocalDate.now(), 25, NexiumIngredients);

        // Example 5: Aspirin
        String[] AspirinIngredients = {
                "Acetylsalicylic acid",
                "Lactose monohydrate",
                "Corn starch",
                "Crospovidone",
                "Microcrystalline cellulose"
        };
        MedicineDTO medicineDTO6 = new MedicineDTO("Aspirin", 246810, "AstraZeneca Companies", LocalDate.of(2023, 5, 25), LocalDate.now(), 40, AspirinIngredients);


        // Example 6: Benadryl
        String[] benadrylIngredients = {
                "Diphenhydramine hydrochloride",
                "Lactose",
                "Microcrystalline cellulose",
                "Colloidal silicon dioxide",
                "Magnesium stearate"
        };
        MedicineDTO medicineDTO7 = new MedicineDTO("Benadryl", 135790, "Merck & Co. Companies", LocalDate.of(2023, 9, 30), LocalDate.now(), 35, benadrylIngredients);

        // Example 7: Claritin
        String[] claritinIngredients = {
                "Loratadine",
                "Corn starch",
                "Lactose monohydrate",
                "Magnesium stearate",
                "Povidone"
        };
        MedicineDTO medicineDTO8 = new MedicineDTO("Claritin", 987654, "Novartis Companies", LocalDate.of(2024, 11, 15), LocalDate.now(), 28, claritinIngredients);

        // Example 8: Lipitor
        String[] lipitorIngredients = {
                "Atorvastatin",
                "Lactose monohydrate",
                "Microcrystalline cellulose",
                "Croscarmellose sodium",
                "Hydroxypropyl cellulose"
        };
        MedicineDTO medicineDTO9 = new MedicineDTO("Lipitor", 246801, "Sanofi Companies", LocalDate.of(2023, 7, 22), LocalDate.now(), 45, lipitorIngredients);

        // Example 9: Zoloft
        String[] zoloftIngredients = {
                "Sertraline hydrochloride",
                "Calcium phosphate",
                "Microcrystalline cellulose",
                "Magnesium stearate",
                "Hydroxypropyl cellulose"
        };
        MedicineDTO medicineDTO10 = new MedicineDTO("Zoloft", 753951, "Roche Companies", LocalDate.of(2025, 3, 10), LocalDate.now(), 22, zoloftIngredients);

        // Example 10: Voltaren
        String[] voltarenIngredients = {
                "Diclofenac sodium",
                "Lactose",
                "Magnesium stearate",
                "Cellulose",
                "Povidone"
        };
        MedicineDTO medicineDTO11 = new MedicineDTO("Voltaren", 369258, "Bayer Companies", LocalDate.of(2023, 12, 5), LocalDate.now(), 18, voltarenIngredients);


        // Example 11: Voltaren
        String[] peptoBismolIngredients = {
                "Bismuth subsalicylate",
                "Calcium carbonate",
                "Magnesium aluminum silicate",
                "Methylcellulose",
                "Water"
        };
        MedicineDTO medicineDTO12 = new MedicineDTO("Pepto-Bismol", 246813, "Eli Lilly and Company ", LocalDate.of(2024, 6, 8), LocalDate.of(2024,01,27), 27, peptoBismolIngredients);

        // Example 12: Robitussin
        String[] robitussinIngredients = {
                "Dextromethorphan",
                "Guaifenesin",
                "Potassium sorbate",
                "Sucralose",
                "Sodium benzoate"
        };
        MedicineDTO medicineDTO13 = new MedicineDTO("Robitussin", 135792, "Bristol-Myers Squibb Companies", LocalDate.of(2023, 11, 19), LocalDate.now(), 33, robitussinIngredients);

        // Example 13: Allegra
        String[] allegraIngredients = {
                "Fexofenadine hydrochloride",
                "Croscarmellose sodium",
                "Pregelatinized starch",
                "Stearic acid",
                "Titanium dioxide"
        };
        MedicineDTO medicineDTO14 = new MedicineDTO("Allegra", 975318, "Abbott Laboratories Companies", LocalDate.of(2025, 4, 15), LocalDate.of(2024,01,26), 24, allegraIngredients);

        // Example 14: Flonase
        String[] flonaseIngredients = {
                "Fluticasone propionate",
                "Benzalkonium chloride",
                "Dextrose",
                "Microcrystalline cellulose",
                "Carboxymethylcellulose sodium"
        };
        MedicineDTO medicineDTO15 = new MedicineDTO("Flonase", 864209, "Gilead Sciences Companies", LocalDate.of(2024, 10, 3), LocalDate.of(2024,01,15), 19, flonaseIngredients);

        // Example 15: Ritalin
        String[] ritalinIngredients = {
                "Methylphenidate hydrochloride",
                "Corn starch",
                "Lactose monohydrate",
                "Magnesium stearate",
                "Microcrystalline cellulose",
                "talck"
        };
        MedicineDTO medicineDTO16 = new MedicineDTO("Ritalin", 753190, "Takeda Pharmaceutical  Companies", LocalDate.of(2023, 8, 12), LocalDate.of(2024,01,25), 30, ritalinIngredients);

        // Example 16: Ritalin
        String[] motrinIngredients = {
                "Ibuprofen",
                "Silicon dioxide",
                "Sodium lauryl sulfate",
                "Magnesium stearate",
                "Dimenhydrinate",
                "Lactose monohydrate",

        };
        MedicineDTO medicineDTO17 = new MedicineDTO("Motrin", 369258, "Novo Nordisk Companies", LocalDate.of(2024, 7, 20), LocalDate.now(), 26, motrinIngredients);

        // Example 17: Sudafed
        String[] sudafedIngredients = {
                "Pseudoephedrine",
                "Microcrystalline cellulose",
                "Magnesium stearate",
                "Sodium starch glycolate",
                "Croscarmellose sodium"
        };
        MedicineDTO medicineDTO18 = new MedicineDTO("Sudafed", 258369, "Amgen Companies", LocalDate.of(2023, 9, 15), LocalDate.now(), 30, sudafedIngredients);

        // Example 18: Imodium
        String[] imodiumIngredients = {
                "Loperamide",
                "Pregelatinized starch",
                "Microcrystalline cellulose",
                "Magnesium stearate",
                "Talc",
                "Dimenhydrinate",
                "Lactose monohydrate",
        };
        MedicineDTO medicineDTO19 = new MedicineDTO("Imodium", 147852, "Boehringer Ingelheim Companies", LocalDate.of(2025, 5, 10), LocalDate.now(), 22, imodiumIngredients);

        // Example 19: Dramamine
        String[] dramamineIngredients = {
                "Dimenhydrinate",
                "Lactose monohydrate",
                "Croscarmellose sodium",
                "Magnesium stearate",
                "Colloidal silicon dioxide"
        };
        MedicineDTO medicineDTO20 = new MedicineDTO("Dramamine", 753951, "Teva Pharmaceutical Industries Companies", LocalDate.of(2024, 8, 30), LocalDate.now(), 18, dramamineIngredients);

        // Example 20: Aleve
        String[] aleveIngredients = {
                "Naproxen",
                "Microcrystalline cellulose",
                "Magnesium stearate",
                "Colloidal silicon dioxide",
                "Lactose monohydrate"

        };
        MedicineDTO medicineDTO21 = new MedicineDTO("Aleve", 951753, "AbbVie Companies", LocalDate.of(2023, 11, 25), LocalDate.now(), 35, aleveIngredients);

        // Example 21: Mucinex
        String[] mucinexIngredients = {
                "Guaifenesin",
                "Microcrystalline cellulose",
                "Croscarmellose sodium",
                "Magnesium stearate",
                "Silicon dioxide",
                "talc"
        };
        MedicineDTO medicineDTO22 = new MedicineDTO("Mucinex", 123456, "Pharmaceutical Companies", LocalDate.of(2025, 2, 5), LocalDate.now(), 40, mucinexIngredients);

        // Example 22: NyQuil
        String[] nyquilIngredients = {
                "Acetaminophen",
                "Dextromethorphan",
                "Doxylamine succinate",

        };
        MedicineDTO medicineDTO23 = new MedicineDTO("NyQuil", 789456, "Biogen Companies", LocalDate.of(2023, 12, 15), LocalDate.now(), 24, nyquilIngredients);

        List<MedicineDTO> list=new ArrayList<>();
        list.add(medicineDTO1);
        list.add(medicineDTO2);
        list.add(medicineDTO3);
        list.add(medicineDTO4);
        list.add(medicineDTO5);
        list.add(medicineDTO6);
        list.add(medicineDTO7);
        list.add(medicineDTO8);
        list.add(medicineDTO9);
        list.add(medicineDTO10);
        list.add(medicineDTO11);
        list.add(medicineDTO12);
        list.add(medicineDTO13);
        list.add(medicineDTO14);
        list.add(medicineDTO15);
        list.add(medicineDTO16);
        list.add(medicineDTO17);
        list.add(medicineDTO18);
        list.add(medicineDTO19);
        list.add(medicineDTO20);
        list.add(medicineDTO21);
        list.add(medicineDTO22);
        list.add(medicineDTO23);


        System.out.println("Sort all medicine by company Name");
        Collections.sort(list);                             //Sort all medicine by company Name
        list.forEach(l-> System.out.println(l));
        System.out.println("************************************************");


        System.out.println("Sort all medicine by ExpiryDate");
        list.stream().sorted((e1,e2)->e2.getExpiryDate().compareTo(e1.getExpiryDate()))
                .forEach(l-> System.out.println(l));                       //Sort all medicine by ExpiryDate
        System.out.println("************************************************");

        System.out.println("Sort all medicine by cost asce order");
        list.stream().sorted((a1,a2)->Double.compare(a1.getCost(), a2.getCost())).forEach(l-> System.out.println(l));//Sort all medicine by cost asce order
        System.out.println("************************************************");

        System.out.println("collect all elements where indegrendts greter than 5");
        List<MedicineDTO> list1=list.stream().filter(l->l.getIndgredient().length>5).collect(Collectors.toList());//collect all elements where indegrendts greter than 5
        list1.forEach(l-> System.out.println(l));
        System.out.println("************************************************");

        System.out.println("collect only String indegrendts");
        List<String[]> ingredientsArrays = list.stream()
                .map(MedicineDTO::getIndgredient)
                .collect(Collectors.toList());

        ingredientsArrays.forEach(ingredientsArray -> {
            for (String ingredient : ingredientsArray) {        //collect only String indegrendts
                System.out.println(ingredient);
            }
        });
        System.out.println("************************************************");

        System.out.println("Collect only company sort by desc");
        List<String> companyDesc=list.stream().map(MedicineDTO::getCompany).collect(Collectors.toList()); //Collect only company sort by desc
        companyDesc.stream().sorted(Collections.reverseOrder()).forEach(l-> System.out.println(l.toUpperCase()));
        System.out.println("************************************************");

        System.out.println("Collect only name in desc");
        List<String> ref=list.stream().map(MedicineDTO::getName).map(String::toLowerCase).collect(Collectors.toList());
        ref.stream().sorted(Collections.reverseOrder()).forEach(l-> System.out.println(l));     //Collect only name in desc
        System.out.println("************************************************");


        System.out.println("Collect all elememts manf Date less than 30");
        LocalDate localDate1=LocalDate.of(2024, 01, 21);
        LocalDate localDate=LocalDate.of(2024,02,21);   //Collect all elememts manf Date less than 30
         list.stream()
                .filter(medicineDTO ->medicineDTO.getManfDate().isBefore(localDate) && medicineDTO.getManfDate().isAfter(localDate1)).forEach(l-> System.out.println(l));

        System.out.println("************************************************");
        System.out.println("Collect all elememts manf Date greter than 30");
        LocalDate localDate2=LocalDate.of(2024, 03, 21);
        LocalDate localDate3=LocalDate.of(2024,01,21);   //Collect all elememts manf Date less than 30
        list.stream()
                .filter(medicineDTO ->medicineDTO.getManfDate().isBefore(localDate2) && medicineDTO.getManfDate().isAfter(localDate3)).forEach(l-> System.out.println(l));
    }
}








